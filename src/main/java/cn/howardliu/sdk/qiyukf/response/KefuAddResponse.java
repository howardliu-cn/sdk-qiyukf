package cn.howardliu.sdk.qiyukf.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
public class KefuAddResponse extends BaseResponse {
    private String id;// 客服id
}
