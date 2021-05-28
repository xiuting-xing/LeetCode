package Array;

import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/5/28--11:49
 * @Version 1.0
 * @Description
 */
public class TotalHanMingDistanceTest {

    @Test
    public void test()
    {
        TotalHanMingDistance totalHanMingDistance=new TotalHanMingDistance();

        int[] nums={3,5,7,9};

        int distance= totalHanMingDistance.totalHanMingDistance(nums);
    }


}
