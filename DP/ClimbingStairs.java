package DP;


public class ClimbingStairs {
    public static void  main(String[] args) {
        int n=10;
        int[] dp = new int[n+1];
        System.out.println(calc(n ,dp));
    }

    static int calc(int n, int[] dp){
        if(n == 1 || n == 2 || n == 3) return n;

        if(dp[n] != 0) return dp[n];

        dp[n] = calc(n-1, dp) + calc(n-2, dp);

        return dp[n];
    }
}
