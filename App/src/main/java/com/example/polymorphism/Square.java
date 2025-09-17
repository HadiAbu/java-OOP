package main.java.com.example.polymorphism;

public class Square extends Shape {
    private int side;
    
    Square(int side){
        this.side = side;
    }
    
    public void draw() {
        System.out.println("Drawing a square");
    }

    public int area(){
        return this.side * this.side;
    }

    public int perimeter(){
        return 4 * this.side;
    }
}
