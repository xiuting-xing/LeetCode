package Array;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/5/27--16:24
 * @Version 1.0
 * @Description 删除排序数组中的重复项
 */
public class DeleteRepeatItem {
    public int removeDuplicates(int[] nums)
    {
        if (nums.length<=1)
        {
            return nums.length;
        }
        else
        {
            int i=1;
            for(int j=1;j<nums.length;j++) {
                if (nums[j]!=nums[i-1])
                {
                    nums[i]=nums[j];
                    i++;
                }
            }
            return i;
        }
    }

}
