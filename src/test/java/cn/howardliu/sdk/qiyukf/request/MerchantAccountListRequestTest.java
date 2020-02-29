package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.DefaultQiyukfClient;
import cn.howardliu.sdk.qiyukf.QiyuKfException;
import cn.howardliu.sdk.qiyukf.QiyukfClient;
import cn.howardliu.sdk.qiyukf.response.MerchantAccountListResponse;
import org.junit.Assert;
import org.junit.Test;

import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_KEY;
import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_SECRET;

/**
 * <br>created at 2020/2/29
 *
 * @author liuxh
 * @since 1.0.0
 */
public class MerchantAccountListRequestTest {
    @Test
    public void test() throws QiyuKfException {
        final MerchantAccountListRequest request = new MerchantAccountListRequest();
        final QiyukfClient client = new DefaultQiyukfClient(APP_KEY, APP_SECRET);
        final MerchantAccountListResponse response = client.execute(request);
        Assert.assertTrue(response.isSuccess());
        System.out.println(response.getResult());
    }
}
