package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.StaffListResponse;
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
public class StaffListRequest extends BaseRequest<StaffListResponse> {
    private Integer status;// 客服状态，默认所有状态，1=正常，2=已删除，3=已停用
    @NotNull
    private Integer role;// 客服角色，默认所有角色，1=工单客服，0=普通客服，1=管理员，2=超级管理员

    @Override
    public @NotNull String command() {
        return "/openapi/v2/staff/list";
    }

    @Override
    public Class<StaffListResponse> responseClass() {
        return StaffListResponse.class;
    }
}
