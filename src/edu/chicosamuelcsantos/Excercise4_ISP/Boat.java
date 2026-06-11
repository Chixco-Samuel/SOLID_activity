package edu.chicosamuelcsantos.Excercise4_ISP;

public class Boat implements Sailable {
    @Override
    public void sail() {
        System.out.println("The boat is sailing.");
    }
}