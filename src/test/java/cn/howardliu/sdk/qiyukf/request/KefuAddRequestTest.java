package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.DefaultQiyukfClient;
import cn.howardliu.sdk.qiyukf.QiyuKfException;
import cn.howardliu.sdk.qiyukf.QiyukfClient;
import cn.howardliu.sdk.qiyukf.response.KefuAddResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_KEY;
import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_SECRET;

/**
 * <br>created at 2019/10/27
 *
 * @author liuxh
 * @since 1.0.0
 */
public class KefuAddRequestTest {
    @Test
    @Ignore
    public void test() throws QiyuKfException {
        final KefuAddRequest request = new KefuAddRequest();
        QiyukfClient client = new DefaultQiyukfClient(APP_KEY, APP_SECRET);
        final KefuAddResponse response = client.execute(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getCode());
    }
}
