package cn.howardliu.sdk.qiyukf.response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
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
public class StaffGroupListResponse extends BaseResponse {
    private List<StaffGroup> data = new ArrayList<>();

    @Override
    public void parseData() {
        final JsonArray jsonArray = new JsonParser().parse(getMessage()).getAsJsonArray();
        for (final JsonElement element : jsonArray) {
            data.add(new Gson().fromJson(element, StaffGroup.class));
        }
    }

    @NoArgsConstructor
    @Data
    public static class StaffGroup {
        private Integer id;
        private String name;
        private List<Integer> staffIdList;
    }
}
