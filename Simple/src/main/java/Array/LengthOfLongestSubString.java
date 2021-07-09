package Array;

import java.util.HashMap;

/**
 * @Author ken_xing
 * @Date 2021/5/29 3:32 下午
 * @Version 1.0
 * @Description 取出字符串中的最长子串，返回最长子串的长度
 */
public class LengthOfLongestSubString {
    public int getLengthOfSubString(String str)
    {
        int strLength=str.length();

        HashMap<Character, Integer> hs=new HashMap<Character, Integer>();

        for(int i=0;i<strLength;i++) {
            char indexStr = str.charAt(i);
            if (!hs.containsKey(indexStr)) {
                hs.put(indexStr, i);
            }
        }
        return hs.size();

    }
}
