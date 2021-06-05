package Array;

/**
 * @Author ken_xing
 * @Date 2021/5/28--14:15
 * @Version 1.0
 * @Description 从数组中取出两数使该两数之和等于目标数
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

}
