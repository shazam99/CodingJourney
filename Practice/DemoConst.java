package Practice;

public class DemoConst {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.show(3);
        c.print();
    }
}

abstract class Parent{
    abstract void show();

    abstract void show(int a);

    void print(){
        System.out.println("print");
    }
}

class Child extends Parent{

    @Override
    void show() {
        System.out.println("show");
    }

    @Override
    void show(int a) {
        System.out.println("show "+a);
    }
    void print(){
        System.out.println("print child");
    }
}
