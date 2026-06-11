package edu.chicosamuelcsantos.Excercise5_DIP;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Database Logger: " + message);
    }
}