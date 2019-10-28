package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuGroupUpdateResponse;
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
public class KefuGroupUpdateRequest extends BaseRequest<KefuGroupUpdateResponse> {
    private String groupId;
    private String name;

    @Override
    public @NotNull String command() {
        return "/openapi/kefuGroup/update";
    }

    @Override
    public Class<KefuGroupUpdateResponse> responseClass() {
        return KefuGroupUpdateResponse.class;
    }
}
