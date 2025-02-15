package Practice;

public class EncryptedString {

    public static void main(String[] args) {
//        Input:  "saaavvvvvqql"
//        Output: "s1a3v5q2l1"

        String input = "saaavvvvvqq";
        char currChar = input.charAt(0);
        int freq = 0;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(currChar == input.charAt(i)){
                freq++;
            }else if(currChar != input.charAt(i)){
                result.append(currChar).append(freq);
                currChar = input.charAt(i);
                freq = 1;
            }
        }
        result.append(currChar).append(freq);
        System.out.println(result);
    }
}
