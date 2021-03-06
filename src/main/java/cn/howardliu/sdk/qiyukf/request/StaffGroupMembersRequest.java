package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.StaffGroupMembersResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

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
public class StaffGroupMembersRequest extends BaseRequest<StaffGroupMembersResponse> {
    private String groupId;
    private Integer role;

    @Override
    public @NotNull String command() {
        return "/openapi/v2/staff/group/members";
    }

    @Override
    public Class<StaffGroupMembersResponse> responseClass() {
        return StaffGroupMembersResponse.class;
    }
}
