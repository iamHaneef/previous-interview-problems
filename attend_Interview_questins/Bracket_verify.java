package Beginner_Interview_Question.attend_Interview_questins;

import java.util.Stack;

public class Bracket_verify {

    public static boolean check(String str)
    {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
        {
            if(c == '{')
            {
                stack.push('}');
            }
            else if(c == '[')
            {
                stack.push(']');
            }
            else if(c == '(')
            {
                stack.push(')');
            }
            else if(Character.isLetterOrDigit(c))
            {
                continue;
            }
            else {
                if(stack.isEmpty() || stack.pop() != c)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "{[]}([])abc123";
        System.out.println(check(str1));

        String str2 = "{{{abc[[[12]ab]]}()}}";
        System.out.println(check(str2));
    }

}
