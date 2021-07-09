package Stack;

import java.util.*;

/**
 * @Author ken_xing
 * @Date 2021/7/9--15:25
 * @Version 1.0
 * @Description 有效的括号
 */
public class ValidParentheses {
    public boolean isValidMethod1(String s)
    {
        if (s.length()%2!=0)
        {
            return false;
        }
        else
        {
            int loopNum=s.length()/2;
            for (int i=0;i<loopNum;i++)
            {
                s.replace("()","").replace("[]","").replace("{}","");
            }
            if (s.length()==0)
                return true;
            else
                return false;
        }
    }

    public boolean isValidMethod2(String s)
    {
        if (s.length()%2!=0)
        {
            return false;
        }
        else
        {
            Stack<Character> stack=new Stack<Character>();
            Map map=new HashMap();

            map.put("}","{");
            map.put("]","[");
            map.put(")","(");

            for (int i=0;i<s.length();i++) {

                if (map.containsKey(s.charAt(i)))
                {
                    if (!stack.empty()&&stack.peek()==map.get(s.charAt(i)))
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
            if (stack.size()==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
