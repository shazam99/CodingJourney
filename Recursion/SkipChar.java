package Recursion;

public class SkipChar {

    public static void main(String[] args) {
        skip("", "baccarat");
        System.out.println(skip("abc"));
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if(c == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+c, up.substring(1));
        }
    }

    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char c = up.charAt(0);
        if(c == 'a'){
            return skip(up.substring(1));
        }else{
            return c + skip(up.substring(1));
        }
    }
}
