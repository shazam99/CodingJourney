package Top150.Intervals;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {
    // 452. Minimum Number of Arrows to Burst Balloons
    public static void main(String[] args){
        int[][] points = new int[][]{{1,2}, { 1, 2 }};
        System.out.println(findMinArrowShots(points));
    }
    
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));

        int arrows = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            // If current balloon starts after previous end, add a new arrow
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1]; // Reset the end to the current balloon's end
            } else {
                // Overlapping range — minimize end
                end = Math.min(end, points[i][1]);
            }
        }
        return arrows;
    }
}
