package edu.chicosamuelcsantos.Excercise4_ISP;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane is flying.");
    }
}