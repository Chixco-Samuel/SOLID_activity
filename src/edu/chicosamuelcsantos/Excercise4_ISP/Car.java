package edu.chicosamuelcsantos.Excercise4_ISP;

public class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }
}