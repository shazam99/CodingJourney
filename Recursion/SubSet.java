package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3);
        List<Integer> output = new ArrayList<>();
        int index = 0;

        getSubSet(nums, output, index);
    }

    public static void getSubSet(List<Integer> nums, List<Integer> output, int index){
        if(index>=nums.size()){
            System.out.println(output);
            return;
        }
        getSubSet(nums, output, index+1);
        output.add(nums.get(index));
        getSubSet(nums, output, index+1);
        output.remove(output.size() -1);
    }
    
}
