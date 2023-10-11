import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main (String [] args) {
        String s = "((";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 == 1 || s.length() == 0) return false;

        Stack<Character> elements = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                elements.push(c);
            }
            else {
                if(elements.isEmpty()) return false;

                char tmp = elements.pop();
                if(c == ')' && tmp != '(' ||
                   c == ']' && tmp != '[' ||
                   c == '}' && tmp != '{') {
                    return false;
                }
            }
        }
        return elements.empty();
    }
}
