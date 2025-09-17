package main.java.com.example.abstraction;
import main.java.com.example.Inheritance.Car;

public class Audi extends Factory {
    private Car car;
    public Audi(Car car) {
        this.car = car;
        sendGreeting();
    }
    public void deliverCar() {
        System.out.println("Your car is ready for delivery!");
        sendThank();
    }
    @Override
    void createProduct(Car car) {
        this.car = car;
        System.out.println("Audi car created successfully!");
    }
    
}
