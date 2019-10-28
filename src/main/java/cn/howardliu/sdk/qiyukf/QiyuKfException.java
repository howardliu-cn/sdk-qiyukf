package cn.howardliu.sdk.qiyukf;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
public class QiyuKfException extends Exception {
    public QiyuKfException() {
    }

    public QiyuKfException(final String message) {
        super(message);
    }

    public QiyuKfException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public QiyuKfException(final Throwable cause) {
        super(cause);
    }

    public QiyuKfException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
