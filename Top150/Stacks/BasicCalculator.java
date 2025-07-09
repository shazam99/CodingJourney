package Top150.Stacks;

import java.util.Arrays;

public class BasicCalculator {
    // 224. Basic Calculator
    public static void main(String[] args){
        String s = "11 + 1";
        System.out.println(calculate(s));
    }
    
    public static int calculate(String s) {
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        return 0;
    }
}
