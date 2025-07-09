package Top150.Stacks;

import java.util.Stack;

public class ValidParentheses {
    // 20. Valid Parentheses
    public static void main(String[] args){
        String s = ")";
        System.out.println(isValid(s));
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '[' || c== '{' || c=='('){
                stack.add(c);
            }else{
                if(stack.isEmpty()) return false;
                char temp = stack.pop();
                if(temp == '{' && c != '}'){
                    return false;
                }
                if (temp == '(' && c != ')') {
                    return false;
                }
                if (temp == '[' && c != ']') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
