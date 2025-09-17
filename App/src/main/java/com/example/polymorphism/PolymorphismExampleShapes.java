package main.java.com.example.polymorphism;

class polymorphismExampleShapes {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        genericShape.draw();
        
        Square square = new Square(5);
        square.draw();
        System.out.println("area is: "+ square.area()+" perimeter is: "+ square.perimeter());

        Rectangle rectangle = new Rectangle(2,5);
        rectangle.draw();
        System.out.println("area is: "+ rectangle.area()+" perimeter is: "+ rectangle.perimeter());
    }
}