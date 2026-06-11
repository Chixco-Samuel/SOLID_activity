package edu.chicosamuelcsantos.Excercise2_OCP;

public class PaymentProcessor {
    public void processPayment(PaymentMethod payment, double amount) {
        payment.pay(amount);
    }
}