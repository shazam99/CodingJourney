package Math.Bitwisw;

public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 109;
        String result = "";
        while(decimalNumber>0){
            int rem = decimalNumber%2;
            decimalNumber = decimalNumber/2;
            result = rem + result;
        }
        System.out.println(result);
    }
}
