package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuGroupAddResponse;
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
public class KefuGroupAddRequest extends BaseRequest<KefuGroupAddResponse> {
    private String name;

    @Override
    public @NotNull String command() {
        return "/openapi/kefuGroup/add";
    }

    @Override
    public Class<KefuGroupAddResponse> responseClass() {
        return KefuGroupAddResponse.class;
    }
}
