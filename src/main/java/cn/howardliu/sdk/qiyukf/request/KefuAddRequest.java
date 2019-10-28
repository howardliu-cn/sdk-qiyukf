package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.KefuAddResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class KefuAddRequest extends BaseRequest<KefuAddResponse> {
    @NotNull
    private String username;// 客服账号，仅支持数字、字母、下划线、圆点，首字母必须是字母，不超过40个长度
    @NotNull
    private String password;// 客服密码，需要使用md5加密算法加密后转小写，长度是32位，不能包含'-'字符
    @NotNull
    private Integer role = 0;// 角色种类 0 普通客服，1 管理员，-1 工单客服，-2 呼叫客服
    @NotNull
    private Integer subRoleId; // 角色id，目前只能通过浏览器的开发者工具查看获得。请以管理员角色登录七鱼后，点击左侧导航树"客服管理"菜单，在打开的页面上点击"角色设置"选项卡，对应的请求url为 api/kefuSet/list/get
    private String realname;// 用户名称，不超过40个长度
    private String nickname;// 昵称，不超过40个长度
    private String pinyin;// 客服名称拼音
    private String mobile;// 用户电话
    private String email;// 用户邮件
    private Integer maxSession;// 客服最大接待数
    private Integer callEnable;// 是否有电话权限， 0 否 1 有
    private Integer skillScoreChat;// 在线会话技能值(0-10)
    private Integer skillScoreIpcc;// 电话技能值(0-10)
    private List<Integer> groupIds; // 客服分组id数组，是数组[]，不是字符串

    @Override
    public String command() {
        return "/openapi/kefu/add";
    }

    @Override
    public Class<KefuAddResponse> responseClass() {
        return KefuAddResponse.class;
    }
}
