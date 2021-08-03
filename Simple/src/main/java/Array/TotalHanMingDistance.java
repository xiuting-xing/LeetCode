package Array;

/**
 * @Author ken_xing
 * @Date 2021/5/28--11:42
 * @Version 1.0
 * @Description 计算汉明的距离
 */
public class TotalHanMingDistance {
    public int totalHanMingDistance(int[] nums)
    {
        //定义汉明总距离
        int totalDistance=0;
        //数组长度
        int groupLength=nums.length;

        for(int i=0; i< 30; i++)
        {
            int c=0;
                for (int j:nums)
            {
                c+=(j>>i)&1;
            }
            totalDistance+=c*(groupLength-c);
        }
        return totalDistance;
    }
}
