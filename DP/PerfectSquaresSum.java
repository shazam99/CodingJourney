package DP;

public class PerfectSquaresSum {

    public static void main(String[] args) {
        int n= 5;
        int[] dp = new int[n+1];
        System.out.println(minSq(n,dp));
    }
    static int minSq(int n, int[] dp){
        if(n==0 || n==1) return n;
        if(dp[n] != 0) return dp[n];

        int smallest = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
            int temp = minSq(n-i*i, dp);
            smallest = Math.min(smallest, temp);
        }
        dp[n] = smallest +1;
        return dp[n];
    }
}
