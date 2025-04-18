package DesignPatterns.Builder;

import Utility.Utils;

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order.Builder()
                        .setId(1)
                        .setAddress("Delhi")
                        .setCustomerName("Siddharth")
                        .setMobile("8800629814")
                        .setProduct("iPhone")
                        .build();

        Utils.printFields(myOrder);
    }
}
