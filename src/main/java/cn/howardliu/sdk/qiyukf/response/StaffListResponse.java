package cn.howardliu.sdk.qiyukf.response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>created at 2019/10/28
 *
 * @author liuxh
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class StaffListResponse extends BaseResponse {
    private List<Staff> data = new ArrayList<>();

    @Override
    public void parseData() {
        final JsonArray jsonArray = new JsonParser().parse(getMessage()).getAsJsonArray();
        for (final JsonElement element : jsonArray) {
            data.add(new Gson().fromJson(element, Staff.class));
        }
    }

    @Data
    @NoArgsConstructor
    public static class Staff {
        private Integer id;
        private String username;
        private String realname;
        private String nickname;
        private Integer role;
        private String phone;
        private String email;
        private Integer status;
        private Long createtime;
        private Integer maxServiceCount;
    }
}
