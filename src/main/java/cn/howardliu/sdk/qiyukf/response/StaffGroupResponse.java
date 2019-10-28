package cn.howardliu.sdk.qiyukf.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
public class StaffGroupResponse extends BaseResponse {
    private List<StaffGroup> message;

    @NoArgsConstructor
    @Data
    public static class StaffGroup {
        private Integer id;
        private String name;
        private List<Integer> staffIdList;
    }
}
