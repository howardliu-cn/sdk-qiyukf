package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.MerchantAccountListResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

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
public class MerchantAccountListRequest extends BaseRequest<MerchantAccountListResponse> {
    private int offset = 0;
    private int limit = 100;

    @Override
    public @NotNull String command() {
        return "/platform/api/openapi/merchant/list";
    }

    @Override
    public Class<MerchantAccountListResponse> responseClass() {
        return MerchantAccountListResponse.class;
    }
}
