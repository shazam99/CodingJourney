public class InterfaceMain {
    public static void main(String[] args) {
        Janwar d = new Kutta();
        d.eat();
        d.sound();
        d.size();
        System.out.println(Panchi.legs);
    }
}

 interface Janwar {
    void sound();
    void eat();
    default void size(){
        System.out.println("100m");
    }
}

interface Panchi{
    int legs=5;
    default void size() {
        System.out.println("50m");
    }
}

class Kutta implements Janwar{

    @Override
    public void sound() {
        System.out.println("bark");
    }
    @Override
    public void eat() {
        System.out.println("dog eating");
    }
    public void run(){
        System.out.println("dog running");
    }

}