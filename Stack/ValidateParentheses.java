package Stack;

import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("{[]() }")); // true
        System.out.println(isValid("(()()())")); // true
        System.out.println(isValid("(()())()")); // false
    }

    private static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.add(c);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

}
