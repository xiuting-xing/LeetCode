package Array;

import org.junit.Test;

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
}
