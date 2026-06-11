package edu.chicosamuelcsantos.Excercise2_OCP;

public class GCashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing GCash payment of $" + amount);
    }
}