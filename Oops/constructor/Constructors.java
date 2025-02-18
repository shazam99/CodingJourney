package Oops.constructor;

public class Constructors {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.output();

        Calculator c2 = new Calculator(5, 10);
        c2.output();

        Calculator c3 = new Calculator(5, "Sid");
        c3.output();
    }
}

class Calculator{
    private int x;
    private int y;
    private String z;

    /**
         default Constructor
    */
    public Calculator(){}

    /**
     * Parameterized Constructor
     * A constructor through which we can pass one or more parameters.
     */

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    /** parameterized Constructor
        A Constructor through which we can pass one or more parameters
    */
    public Calculator(int x, String z){
        this.x = x;
        this.z = z;
    }

    void output(){
        System.out.println(x + " " + y + " " + z);
    }
}
