package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuUpdateResponse;
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
public class KefuUpdateRequest extends BaseRequest<KefuUpdateResponse> {
    private String id;
    private String username;
    private String password;
    private Integer role;
    private Integer subRoleId;
    private String realname;
    private String nickname;
    private String pinyin;
    private String mobile;
    private String email;
    private Integer maxSession;
    private Integer callEnable;
    private Integer skillScoreChat;
    private Integer skillScoreIpcc;
    private List<Integer> groupIds;

    @Override
    public @NotNull String command() {
        return "/openapi/kefu/update";
    }

    @Override
    public Class<KefuUpdateResponse> responseClass() {
        return KefuUpdateResponse.class;
    }
}
