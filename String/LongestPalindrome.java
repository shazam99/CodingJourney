package String;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(lpd("aabacixcaba"));
    }
    public static String lpd(String str){
        if(str.length() <= 1){
            return str;
        }
        String lps = "";

        for(int i=1; i<str.length(); i++){

            // odd palindrome
            int low =i;
            int high =i;

            while(str.charAt(low) == str.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == str.length()){
                    break;
                }
            }

            String palindrome = str.substring(low+1,high);
            lps = lps.length() > palindrome.length() ? lps : palindrome;

            // even palindrome
            low = i-1;
            high = i;

            while(str.charAt(low) == str.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == str.length()){
                    break;
                }
            }
            palindrome = str.substring(low+1,high);
            lps = lps.length() > palindrome.length() ? lps : palindrome;
        }
        return lps;
    }
}
