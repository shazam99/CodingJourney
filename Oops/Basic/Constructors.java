package Oops.Basic;

public class Constructors {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.output();

        Calculator c2 = new Calculator(5, 10);
        c2.output();
    }
}

class Calculator{
    private int x;
    private int y;

    public Calculator(){             // default Constructor
    }

    public Calculator(int x, int y){ // parameterized Constructor
        this.x = x;
        this.y = y;
    }

    void output(){
        System.out.println(x + " " + y);
    }
}
