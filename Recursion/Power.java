package Recursion;

public class Power {
    public static void main(String[] args){
        int a = 2;
        int b = 2;

        System.out.println(pow(a, b, 1));
    }
    public static int pow(int num, int expo, int answer){
        if(expo == 0){
            return answer;
        }
        return pow(num, expo-1, answer * num);
    }
}
