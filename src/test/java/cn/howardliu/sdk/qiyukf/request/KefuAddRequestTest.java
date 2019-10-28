package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.DefaultQiyukfClient;
import cn.howardliu.sdk.qiyukf.QiyuKfException;
import cn.howardliu.sdk.qiyukf.QiyukfClient;
import cn.howardliu.sdk.qiyukf.response.KefuAddResponse;
import org.junit.Assert;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
public class KefuAddRequestTest {
    public void test() throws QiyuKfException {
        final KefuAddRequest request = new KefuAddRequest();
        QiyukfClient client = new DefaultQiyukfClient("", "");
        final KefuAddResponse response = client.execute(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getCode());
    }
}
