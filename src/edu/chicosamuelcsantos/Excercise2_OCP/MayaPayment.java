package edu.chicosamuelcsantos.Excercise2_OCP;

public class MayaPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Maya payment of $" + amount);
    }
}