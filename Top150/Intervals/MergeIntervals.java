package Top150.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    // 56. Merge Intervals
    // Input:  [[1,3],[2,6],[8,10],[15,18]]
    // Output: [[1,6],[8,10],[15,18]]
    public static void main(String[] args){
        int[][] intervals = new int[][]{{1,4},{0,4}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        int[] ref = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (ref[1] >= intervals[i][0]) {
                ref[1] = Math.max(ref[1], intervals[i][1]);
            } else {
                result.add(ref);
                ref = intervals[i];
            }
        }

        result.add(ref); // Add the last merged interval

        return result.toArray(new int[result.size()][]);
    }

}
