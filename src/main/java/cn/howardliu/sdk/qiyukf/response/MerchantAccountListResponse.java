package cn.howardliu.sdk.qiyukf.response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * <br>created at 2020/2/29
 *
 * @author liuxh
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MerchantAccountListResponse extends BaseResponse {
    private int total = 0;
    private List<MerchantAccount> result = new ArrayList<>();

//    @Override
//    public void parseData() {
//        final String result = getMessage();
//        final JsonArray jsonArray = new JsonParser().parse(result).getAsJsonArray();
//        for (final JsonElement element : jsonArray) {
//            data.add(new Gson().fromJson(element, MerchantAccount.class));
//        }
//    }

    @NoArgsConstructor
    @Data
    public static class MerchantAccount {
        private String id;
        private String domain;
        private String name;
        private int seatNumber;
        private String account;
        private String contact;
        private String status;
    }
}
