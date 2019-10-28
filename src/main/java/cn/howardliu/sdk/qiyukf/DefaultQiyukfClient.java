package cn.howardliu.sdk.qiyukf;

import cn.howardliu.sdk.qiyukf.request.BaseRequest;
import cn.howardliu.sdk.qiyukf.response.BaseResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
@Slf4j
public class DefaultQiyukfClient implements QiyukfClient {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
    private static final String host = "https://qiyukf.com";
    private final String appKey;
    private final String appSecret;
    private int connectTimeout = 15000; // 默认连接超时时间为15秒
    private int readTimeout = 30000; // 默认响应超时时间为30秒

    public DefaultQiyukfClient(final String appKey, final String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    @Override
    public <R extends BaseResponse> R execute(final BaseRequest<R> request) throws QiyuKfException {
        return readResponse(execute2(request), request.responseClass());
    }

    @Override
    public <R extends BaseResponse> String execute2(final BaseRequest<R> request) throws QiyuKfException {
        final String jsonParams;
        try {
            jsonParams = gson.toJson(request);
        } catch (Exception e) {
            throw new QiyuKfException(e);
        }
        log.debug("request is {}", jsonParams);
        final String responseJson;
        try {
            responseJson = doPost(request.command(), jsonParams);
        } catch (IOException e) {
            throw new QiyuKfException(e);
        }
        if (responseJson == null || "".equals(responseJson.trim())) {
            throw new QiyuKfException("Http响应为空");
        }
        log.debug("response is {}", responseJson);
        return responseJson;
    }

    private String doPost(final String command, final String jsonParams) throws IOException {
        final long time = System.currentTimeMillis() / 1000;
        final String md5 = Md5.md5(jsonParams);
        final String checksum = QiyuPushCheckSum.encode(appSecret, md5, time);
        final String fullUrl = host + command + "?appKey=" + appKey + "&time=" + time + "&checksum=" + checksum;
        final String contentType = "application/json";
        return WebUtils.doPost(fullUrl, contentType, jsonParams.getBytes(UTF_8), connectTimeout, readTimeout);
    }

    private <R extends BaseResponse> R readResponse(String json, Class<R> respClass) throws QiyuKfException {
        final R resp;
        try {
            resp = gson.fromJson(json, respClass);
            resp.parseData();
        } catch (JsonSyntaxException e) {
            throw new QiyuKfException("解析json数据失败，json为：" + json + "，待解析类为：" + respClass, e);
        }
        return resp;
    }

    public void setConnectTimeout(final int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(final int readTimeout) {
        this.readTimeout = readTimeout;
    }
}
