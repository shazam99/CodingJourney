package Oops.constructor;

public class PrivateConstructor {

        // this will not work as private constructor is called outside Class
    public static void main(String[] args) {
//         PrivateA r = new PrivateA();
    }
}
class PrivateA{
    int a;
    String b;

    private PrivateA(){
        a = 10;
        b = "sid";
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        PrivateA r = new PrivateA(); // this will work
    }
}