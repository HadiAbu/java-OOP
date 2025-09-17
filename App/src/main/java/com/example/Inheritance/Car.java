package main.java.com.example.Inheritance;

public class Car extends Vehicle {
    
    private String model;
    private int year;

    public Car(String brand) {
        super(brand);
        //TODO Auto-generated constructor stub
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void drive() {
        System.out.println("Car is driving");
    }
    
}
