package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ken_xing
 * @Date 2021/5/28--14:15
 * @Version 1.0
 * @Description 从数组中取出两数，利郎叔之和等于目标数
 */
public class TwoSum {
    /**
    第一种解法，根据目标值获取差，然后拿差进行数组遍历比较
    */
    public int[] getTwoNums(int[] nums,int target)
    {
        int[] answer=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int difference=target-nums[i];
            if(difference>0)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if (difference==nums[j])
                    {
                        answer[0]=nums[i];
                        answer[1]=nums[j];
                        break;
                    }
                }
            }
        }
        return answer;
    }

    /**
     * 第二种解法，采用遍历相加的方法暴力尝试
     * */
    public int[] getTwoNums1(int[] nums,int target)
    {
        int[] answer=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    answer[0]=i;
                    answer[1]=j;
                    break;
                }
            }
        }
        return answer;
    }

    /**
     * 第三种方法，for循环中双参数
     */
    public int[] getTwoNums2(int[] nums,int target)
    {
        int[] answer=new int[2];

        for (int i=0,j=i+1;i<nums.length-1;i++,j++) {
            if (nums[i] + nums[j] == target) {
                answer[0] = i;
                answer[1] = j;
                break;
            }
        }
        return answer;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] nums2 = new int[2];
        for(int i=0;i<nums.length;i++){
            int num2=target-nums[i];
            if(map.containsKey(num2)){
                nums2[0]=map.get(num2);
                nums2[1]=i;
            }else {
                map.put(nums[i],i);
            }
        }
        return nums2;
    }

}
