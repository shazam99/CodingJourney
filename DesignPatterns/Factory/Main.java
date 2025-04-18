package DesignPatterns.Factory;

import DesignPatterns.Factory.PaymentServices.CreditCardService;
import DesignPatterns.Factory.PaymentServices.PayPalService;
import DesignPatterns.Factory.PaymentServices.PaymentService;

public class Main {
    public static void main(String[] args) {
        String type = "PayPal";
        getMethod(type).processPayments(150);
    }

    public static PaymentService getMethod(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "CreditCard":
                return new CreditCardService();
            case "PayPal":
                return new PayPalService();
            default:
                return null;
        }
    }
}
