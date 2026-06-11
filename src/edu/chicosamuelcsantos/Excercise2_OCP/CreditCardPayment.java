package edu.chicosamuelcsantos.Excercise2_OCP;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Implement credit card payment processing logic here
        System.out.println("Processing credit card payment of $" + amount);
    }
}