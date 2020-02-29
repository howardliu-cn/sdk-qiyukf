package cn.howardliu.sdk.qiyukf.response;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
@Data
public abstract class BaseResponse {
    @NotNull
    private String code;
    private String message;

    public void parseData() {
    }

    @NotNull
    public boolean isSuccess() {
        return "200".equals(code);
    }
}
