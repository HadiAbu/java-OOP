package main.java.com.example.polymorphism;

class polymorphismExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
    }
}