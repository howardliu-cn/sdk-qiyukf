package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuGroupUpdateKefusResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
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
public class KefuGroupUpdateKefusRequest extends BaseRequest<KefuGroupUpdateKefusResponse> {
    private Integer groupId;
    private List<Integer> kefuIds;

    @Override
    public @NotNull String command() {
        return "/openapi/kefuGroup/updateKefus";
    }

    @Override
    public Class<KefuGroupUpdateKefusResponse> responseClass() {
        return KefuGroupUpdateKefusResponse.class;
    }
}
