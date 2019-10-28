package cn.howardliu.sdk.qiyukf.request;

import cn.howardliu.sdk.qiyukf.DefaultQiyukfClient;
import cn.howardliu.sdk.qiyukf.QiyuKfException;
import cn.howardliu.sdk.qiyukf.QiyukfClient;
import cn.howardliu.sdk.qiyukf.QiyukfConstants;
import cn.howardliu.sdk.qiyukf.response.StaffGroupListResponse;
import org.junit.Assert;
import org.junit.Test;

import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_KEY;
import static cn.howardliu.sdk.qiyukf.QiyukfConstants.APP_SECRET;

/**
 * <br>created at 2019/10/28
 *
 * @author liuxh
 * @since 1.0.0
 */
public class StaffGroupListRequestTest {
    @Test
    public void test() throws QiyuKfException {
        final StaffGroupListRequest request = new StaffGroupListRequest();
        request.setStaff(true);
        final QiyukfClient client = new DefaultQiyukfClient(APP_KEY, APP_SECRET);
        final StaffGroupListResponse response = client.execute(request);
        Assert.assertTrue(response.isSuccess());
        System.out.println(response.getData());
    }
}