package Array;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

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

//        TwoSum twoSum=new TwoSum();
//        int[] group={2,7,11,15};
//        int target=9;
////
////        int[] answer=twoSum.getTwoNums(group,target);
////
////        int[] answer1=twoSum.getTwoNums1(group,target);
//
//
////        for(int i = 1, j = i + 10; i < 5; i ++, j = i *2){
////            System.out.println("i = " + i + " j = " + j);
////        }
//        int[] answer=twoSum.twoSum(group,target);

        Integer num=1234567890;

        String str = num.toString();

        StringBuilder sbStr=new StringBuilder();

        int strLength=str.length();

        for (int i=strLength-1;i>=0;i--)
        {

            char ch= str.charAt(i);
            sbStr.append(ch);
        }

        Integer newInt=Integer.parseInt(sbStr.toString());

       String newInt2 = Math.abs(-1234567890)+"";
    }
}
