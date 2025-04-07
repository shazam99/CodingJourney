package Memory;

import java.util.Arrays;

public class HeapStackMemory {
    public static void main(String[] args) {
        int[] var = new int[]{1,2,3,4,5};
        System.out.println("1: "+  Arrays.toString(var)); // 1,2,3,4,5
        var[3] = 30;
        System.out.println("2: "+Arrays.toString(var)); // 1,2,3,30,5
        edit(var);
        System.out.println("5: "+Arrays.toString(var)); // 1,2,3,30,5
    }
    public static void edit(int[] var){
        var= null;
        System.out.println("3: "+Arrays.toString(var)); //null
        var= new int[]{50};
        System.out.println("4: "+Arrays.toString(var)); // 50

    }
}
