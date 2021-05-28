package Array;

import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/5/28--14:21
 * @Version 1.0
 * @Description
 */
public class TwoSumTest {
    @Test
    public void twoSunTest()
    {
        TwoSum twoSum=new TwoSum();
        int[] group={2,5,7,9,10,1};
        int target=10;

        int[] answer=twoSum.getTwoNums(group,target);

        int[] answer1=twoSum.getTwoNums1(group,target);

    }
}
