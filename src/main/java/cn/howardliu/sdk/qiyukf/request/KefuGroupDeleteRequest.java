package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuGroupDeleteResponse;
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
public class KefuGroupDeleteRequest extends BaseRequest<KefuGroupDeleteResponse> {
    private String groupId;

    @Override
    public @NotNull String command() {
        return "/openapi/kefuGroup/delete";
    }

    @Override
    public Class<KefuGroupDeleteResponse> responseClass() {
        return KefuGroupDeleteResponse.class;
    }
}
