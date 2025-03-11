import java.io.Serializable;

interface A {
    int legs = 5;
    default void show() {
        System.out.println("A");
    }
}

interface B{
    int legs = 19;
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B ,Serializable{

    @Override
    public void show() {
        System.out.println(A.legs);
    }
}

class Demo{
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}