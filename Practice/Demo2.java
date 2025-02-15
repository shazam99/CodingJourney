package Practice;


class Demo2 {
    public static boolean isSubsequence(int[] larger, int[] subsequence) {
        int i = 0;
        int j = 0;

        while(i < larger.length && j < subsequence.length){
            if(larger[i] == subsequence[j]){
                j++;
            }
            i++;
        }
        return j==subsequence.length;
    }

    public static void main(String[] args) {

        int[] larger = {1, 2, 3, 4};
        int[] subsequence = {1,3};

        boolean sub = isSubsequence(larger, subsequence);
        System.out.println("Is subsequence: " + sub);
    }
}
