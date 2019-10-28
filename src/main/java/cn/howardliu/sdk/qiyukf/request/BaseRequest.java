package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.response.BaseResponse;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
@Data
public abstract class BaseRequest<R extends BaseResponse> {
    @NotNull
    public abstract String command();

    public abstract Class<R> responseClass();
}
