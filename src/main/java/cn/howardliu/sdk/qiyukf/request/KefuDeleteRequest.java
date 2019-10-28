package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuDeleteResponse;
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
public class KefuDeleteRequest extends BaseRequest<KefuDeleteResponse> {
    private String id;

    @Override
    public @NotNull String command() {
        return "/openapi/kefu/delete";
    }

    @Override
    public Class<KefuDeleteResponse> responseClass() {
        return KefuDeleteResponse.class;
    }
}
