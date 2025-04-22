package Top150.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges{
    // 228. Summary Ranges
    public static void main(String[] args){
        int[] nums = new int[]{ 0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int index = 0;   // index for end point - ep
        while(index < nums.length){
            int start = index; // start for staring point - sp
            while(index+1 < nums.length && nums[index]+1 == nums[index+1]){
                index++;
            }

            if(start == index){ // if sp == ep 
                result.add(String.valueOf(nums[start]));
            }else{
                result.add(nums[start]+"->"+nums[index]);
            }
            index++; // increment ep, as all prev points exhausted 
        }
        return result;
    }
}