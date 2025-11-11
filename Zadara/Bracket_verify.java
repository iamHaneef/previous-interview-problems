package Zadara;
import java.util.Stack;
public class Bracket_verify {
    public static boolean process(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }                                                             // {[]}([])abc123
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
            else if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
    public static void main(String[] args) {
        String check = "{[]}([])abc123";
        System.out.println(process(check));

        String check1 = "{{{abc[[[12]ab]]}()}}";
        System.out.println(process(check1));
    }
}
