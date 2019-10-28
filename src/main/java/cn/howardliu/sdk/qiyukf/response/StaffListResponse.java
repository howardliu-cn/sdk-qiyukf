package cn.howardliu.sdk.qiyukf.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
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
    @NotNull
    private Integer code;
    private List<Staff> message = new ArrayList<>();

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
