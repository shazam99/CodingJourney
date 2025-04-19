package Top150.TwoPointers;

public class ContainerWithMostWater {
    // 11. Container With Most Water
    public static void main(String[] args) {
        int[] height = new int[]{8,7,2,1};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxAmount = 0;
        int s = 0;
        int e = height.length-1;
        while(s<e){
            int width = e-s;
            maxAmount = Math.max(maxAmount, width*Math.min(height[s],height[e]));
            if(height.length==2) return maxAmount;
            if(height[s] < height[e]){ // updating the smallest height
                s++;
            }else{
                e--;
            }
        }
        return maxAmount;
    }
}