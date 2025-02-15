package Practice;
import java.io.*;
public class IntegerToRoman {

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9,8,7,6, 5, 4,3,2, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","VIII","VII","VI" ,"V", "IV","III","II", "I"};
        StringBuilder roman = new StringBuilder();
        // Loop through the values and Roman numeral symbols
        for (int i = 0; i < values.length; i++) {
            // While the number is greater than or equal to the current value, append the Roman numeral symbol
            if (num >= values[i]) {
                roman.append(romanLetters[i]);
                num -= values[i]; // Subtract the value from the number
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(23));
    }
}
