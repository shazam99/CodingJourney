package DesignPatterns.Factory.PaymentServices;

public class PayPalService implements PaymentService{

    @Override
    public void processPayments(int amount) {
        System.out.println("Payment Processed for amount: " + amount + " , through " + this.getClass().getSimpleName());
    }
}
