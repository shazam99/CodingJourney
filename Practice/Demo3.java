package Practice;

class Demo3{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.count();

        Vehicle v2 = new Bike();
        v2.count();
//        v2.run();
        v2.demo();

        Bike v3 = new Bike();
        v3.count();
        v3.run();

    }
}


class Vehicle{
    int count(){
        return 3;
    }
    void demo(){
        System.out.println(1);
    }
}

class Bike extends Vehicle{
    int count(){
        return 2;
    }

    void run(){
        System.out.println("run");
    }
}