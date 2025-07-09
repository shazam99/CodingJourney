package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args){
        String str = "abc";
        List<String> ans = new ArrayList<>();

        printSub(str,"",0,ans);
        System.out.println(ans);
    }

    public static void printSub(String str, String op, int index, List<String> ans){
        if(index>=str.length()){
            ans.add(op);
            return;
        }

        printSub(str, op, index+1, ans);
        printSub(str, op + str.charAt(index), index+1, ans);
    }
}
