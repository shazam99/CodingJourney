package Math.Prime;

public class SieveOfEarth {
    public static void main(String[] args) {
        int n=2;
        boolean[] dp = new boolean[n+1];
        for (int i = 2; i < dp.length; i++) {
            dp[i]=true;
        }
        for (int i = 0; i < dp.length; i++) {
            if(dp[i]){
                for (int j = i*i; j < dp.length; j+=i) {
                    dp[j] = false;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            if(dp[i]) System.out.println(i);
        }
    }
}