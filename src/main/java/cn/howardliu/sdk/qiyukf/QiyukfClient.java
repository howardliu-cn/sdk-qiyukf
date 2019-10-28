package cn.howardliu.sdk.qiyukf;

import cn.howardliu.sdk.qiyukf.request.BaseRequest;
import cn.howardliu.sdk.qiyukf.response.BaseResponse;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
public interface QiyukfClient {
    <R extends BaseResponse> R execute(BaseRequest<R> request) throws QiyuKfException;

    <R extends BaseResponse> String execute2(BaseRequest<R> request) throws QiyuKfException;
}
