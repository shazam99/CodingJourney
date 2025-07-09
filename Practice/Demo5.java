package Practice;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
            System.out.println(solve());

    }
    static int solve() {
        return getNumber()/0;
    }
    static int getNumber() throws ArithmeticException{
        return 5/0;
    }
}