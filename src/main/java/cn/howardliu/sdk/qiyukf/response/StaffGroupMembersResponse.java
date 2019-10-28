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
public class StaffGroupMembersResponse extends BaseResponse {
    private List<Staff> message;

    @NoArgsConstructor
    @Data
    public static class Staff {
        private Integer id;
        private String username;
        private String realname;
        private String nickname;
        private Integer role;
        private String phone;
        private String email;
        private Integer status;
        private long createtime;
        private Integer maxServiceCount;
    }
}
