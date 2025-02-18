package Oops.blocks;

public class Blocks {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("main will print 4");
    }
}

class A {

    // Constructor
    A() {
        System.out.println("constructor will print 3");
    }

    // Static initializer block
    // Static block depends upon the Class
    static {
        System.out.println("static will print 1");
    }

    // Instance initializer block
    // Instance block depends upon the Object initialization
    {
        System.out.println("instance will print 2");
    }
}