package main.java.com.example.abstraction;

import main.java.com.example.Inheritance.Car;

public class Main {
    public static void main(String[] args) {
        // Create a car model
        Car car = new Car("A4");

        // Abstract class reference pointing to concrete class
        Factory myAudiFactory = new Audi(car);

        // Create the product
        myAudiFactory.createProduct(car);

        // Deliver the car
        ((Audi) myAudiFactory).deliverCar();
    }
}
