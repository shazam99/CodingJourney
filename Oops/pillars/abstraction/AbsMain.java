class AbsMain{
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.eat();
        c.eat();
        c.sound();
        d.sound();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal const");
    }
    abstract void sound();
    void eat(){
        System.out.println("Animal eating" );
    }
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bark");
    }

}
class Cat extends Animal{
    void eat(){
        System.out.println("cat eating");
    }

    @Override
    void sound() {
        System.out.println("Meow");
    }

}