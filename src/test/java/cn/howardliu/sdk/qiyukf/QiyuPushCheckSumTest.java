package cn.howardliu.sdk.qiyukf;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
public class QiyuPushCheckSumTest {
    @org.junit.Test
    public void encode() {
        final String content = "{\"status\": 0,\"role\": 1}";
        final String appSecret = "4AEE2289D2B446D88942EC4825DE6511";
        final String nonce = Md5.md5(content);
        final Long time = (System.currentTimeMillis() / 1000);
        final String checkSum = QiyuPushCheckSum.encode(appSecret, nonce, time);
        System.out.println("appSecret = " + appSecret);
        System.out.println("content = " + content);
        System.out.println("time = " + time);
        System.out.println("checkSum = " + checkSum);
    }
}