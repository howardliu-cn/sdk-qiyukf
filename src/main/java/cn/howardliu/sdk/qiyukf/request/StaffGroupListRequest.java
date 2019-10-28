package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.StaffGroupListResponse;
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
public class StaffGroupListRequest extends BaseRequest<StaffGroupListResponse> {
    private Boolean staff = false;

    @Override
    public @NotNull String command() {
        return "/openapi/v2/staff/group/list";
    }

    @Override
    public Class<StaffGroupListResponse> responseClass() {
        return StaffGroupListResponse.class;
    }
}
