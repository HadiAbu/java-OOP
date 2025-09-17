package main.java.com.example.abstraction;

import main.java.com.example.Inheritance.Car;

public abstract class Factory {
    abstract void createProduct(Car car);
    // abstract void shipProduct();
    public void sendGreeting(){
        System.out.println("Welcome to our Factory!");
    }
    public void sendThank(){
        System.out.println("Thank you for purchasing from our Factory!");
    }
}
