package Top150.ArraysStrings;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0}));
    }
    private static boolean canJump(int[] arr){
        int reachable = 0;
        for(int i=0; i<arr.length; i++){
            if(i>reachable){
                return false;
            }
            reachable = Math.max(reachable, i+arr[i]);
        }
        return true;
    }
}
