package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.DefaultQiyukfClient;
import cn.howardliu.sdk.qiyukf.QiyuKfException;
import cn.howardliu.sdk.qiyukf.QiyukfClient;
import cn.howardliu.sdk.qiyukf.response.StaffListResponse;
import org.junit.Test;

import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_KEY;
import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_SECRET;

/**
 * <br>created at 2019/10/28
 *
 * @author liuxh
 * @since 1.0.0
 */
public class StaffListRequestTest {
    @Test
    public void test() throws QiyuKfException {
        final StaffListRequest request = new StaffListRequest();
        request.setStatus(0);
        request.setRole(1);
        final QiyukfClient client = new DefaultQiyukfClient(APP_KEY, APP_SECRET);
        final StaffListResponse response = client.execute(request);
        if (response.isSuccess()) {
            System.out.println(response.getMessage());
        }
    }
}