package Array;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @Author ken_xing
 * @Date 2021/5/27--16:31
 * @Version 1.0
 * @Description
 */
public class DeleteRepeatItemTest {

    @Test
    public void removeDuplicatesTest()
    {
        int[] items={1,2,3,3,3,4};
        DeleteRepeatItem deleteRepeatItem =new DeleteRepeatItem();

        int conut= deleteRepeatItem.removeDuplicates(items);

        String ejz=Integer.toHexString(conut);

        int t=(10>>3)&1;
    }

    @Test
    public void Md5Test()
    {
    String msg = "[{\"mailNo\":\"SF1000000001\",\"type\":\"1\"}]|af1f5744dc7945389bd6bcaf982dcfad|20210728171750896";

    String md5=encryptToMD5(msg);
    }

    /**
     * 进行MD5加密
     *
     * @param str
     * @return 进行md5加密后的base64编码
     */
    public static String encryptToMD5(String str) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        byte[] input = str.getBytes(StandardCharsets.UTF_8);
        byte[] output = md.digest(input);
        return Base64.getUrlEncoder().encodeToString(output);

        //1234
    }
}
