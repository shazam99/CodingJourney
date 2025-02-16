package Practice;


class Demo3{
    public static void main(String[] args) {
        Vehicle x1 = new Vehicle();
        x1.sum();
        System.out.println("---------------------");
        Vehicle x2 = new Bike();
        x2.sum();
        x2.special();
        System.out.println("---------------------");
        Bike x3 = new Bike();
        x3.sum();
        x3.special();
    }
}


class Vehicle{
    void sum(){
        System.out.println(100);
    }

    void special(){
        System.out.println("special vehicle");
    }
}

class Bike extends Vehicle{
    void sum(){
        System.out.println(500);
    }
    void run(){
        System.out.println("run");
    }
}