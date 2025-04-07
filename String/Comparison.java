package String;

public class Comparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 = new String("world");
        String s4 = new String("world");

        System.out.println(s3.equals(s4));

    }
}
