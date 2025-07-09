package Recursion;

import java.util.*;

public class Permutations {
    public static void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
        int[] in = {1,2,3};

        solve(in, 0, ans);
        System.out.println(ans);
    }
    public static void solve(int[] in,  int index, List<List<Integer>> ans){
        // base
        if(index >= in.length){
            List<Integer> temp = new ArrayList<>();
            for (int num : in) {
                temp.add(num);
            }
            ans.add(temp);
        }

        // logic
        for(int j=index; j<in.length; j++){
            swap(in, j, index);
            solve(in, index+1, ans);
            swap(in, j, index); // backtrack
        }
    }
    public static void swap(int[] in, int s, int e){
        int temp = in[s];
        in[s] = in[e];
        in[e] = temp;
    }
}
