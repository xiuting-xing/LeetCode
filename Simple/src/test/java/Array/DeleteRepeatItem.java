package Array;

import org.junit.Test;

/**
 * @Author ken_xing
 * @Date 2021/5/27--16:31
 * @Version 1.0
 * @Description
 */
public class DeleteRepeatItem {

    @Test
    public void removeDuplicatesTest()
    {
        DeleteRepeatItem deleteRepeatItem=new DeleteRepeatItem();
        int[] items={1,2,3,3,3,4};

        int conut= deleteRepeatItem.removeDuplicates(items);
    }
}
