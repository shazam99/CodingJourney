package Top150;

public class HIndex {
    // 274. H-Index
    public static void main(String[] args) {
        int[] citations = new int[]{3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] dp = new int[n+1]; // dp with length [n+1]
        for(int cit: citations){
            if(cit>n){
                dp[n]++; // if [i] > n; then add to last index
            }else{
                dp[cit]++;
            }
        }
        int count=0;
        for(int i=n; i>0; i--){
            count+=dp[i];
            if(count>=i){ // first occurrence fits condition
                return i; // return index;
            }
        }
        return 0;
    }
}
