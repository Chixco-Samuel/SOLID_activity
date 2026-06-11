package edu.chicosamuelcsantos;

import edu.chicosamuelcsantos.Excercise1_SRP.*;
import edu.chicosamuelcsantos.Excercise2_OCP.*;
import edu.chicosamuelcsantos.Excercise3_LSP.*;
import edu.chicosamuelcsantos.Excercise4_ISP.*;
import edu.chicosamuelcsantos.Excercise5_DIP.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== SRP =====");
        ReportGenerator generator = new ReportGenerator();
        ReportExporter exporter = new ReportExporter();
        EmailSender sender = new EmailSender();
        
        generator.generateReport();
        exporter.exportReport();
        sender.sendEmail();


        System.out.println("\n===== OCP =====");
        PaymentProcessor payment = new PaymentProcessor();

        payment.processPayment(new GCashPayment(), 1000.0);
        payment.processPayment(new MayaPayment(), 2000.0);
        payment.processPayment(new CreditCardPayment(), 3000.0);


        System.out.println("\n===== LSP =====");
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Square: " + square.getArea());


        System.out.println("\n===== ISP =====");
        Drivable car = new Car();
        Sailable boat = new Boat();
        Flyable airplane = new Airplane();

        car.drive();
        boat.sail();
        airplane.fly();


        System.out.println("\n===== DIP =====");
        UserService fileService = new UserService(new FileLogger());
        UserService consoleService = new UserService(new ConsoleLogger());
        UserService databaseService = new UserService(new DatabaseLogger());

        fileService.createUser("Alice");
        consoleService.createUser("Bob");
        databaseService.createUser("Charlie");
    }
}