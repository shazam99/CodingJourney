package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumbers {
    public static void main(String[] args){
        String[] nums = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        String in = "98";
        // if(in.length() == 0) return ans;


        solve(in, 0, "", nums, ans);
        System.out.println(ans);
    }
    public static void solve(String in, int index, String op, String[] nums, List<String> ans){
        // base case
        if(index >= in.length()){
            ans.add(String.valueOf(op));
            return;
        }

        // logic
        int element = in.charAt(index) - '0';
        String value = nums[element];
        for(int i=0; i<value.length(); i++){
            solve(in, index + 1, op + value.charAt(i), nums, ans);
        }
    }   
}
