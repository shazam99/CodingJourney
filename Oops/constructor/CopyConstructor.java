package Oops.constructor;

/**
    copy constructor is when we pass same class obj as ref to another constructor
    that constructor is copy constructor.
 <p>
    A copy constructor is used when you want to create a new object as a copy of
    an existing object. This is particularly useful when you need to duplicate an
    object with the same state (i.e., the same values for its fields).
 </p>
*/
public class CopyConstructor {
    public static void main(String[] args) {
        A a = new A();    // default
        A ref = new A(a); // copy
    }
}

class A{
    int a;
    String b;

    A(){
        a=10;
        b="sid";
        System.out.println("default: " + a + " " + b);
    }
    A(A ref){
        a = ref.a;
        b = ref.b;
        System.out.println("copy: " + a + " " + b);
    }
}
