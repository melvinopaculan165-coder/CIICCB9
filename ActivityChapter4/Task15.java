
interface Shape {
    double calculateArea();
    double calculatePerimeter();

abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    } 
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public String getColor() {
        return color;
    }
}
class Circle extends AbstractShape {
.
    private double radius;
    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// B. Rectangle: Representing a rectangle. Include length and width as attributes.
class Rectangle extends AbstractShape {

    // Constructor to initialize attributes
    public Rectangle(String color, double length, double width) {
        // Call the parent constructor, which already has length and width.
        super(color, length, width);
        // No need to declare private length/width if using the inherited ones.
    }
    // Implementation for calculateArea (Area = length * width)
    @Override
    public double calculateArea() {
        return length * width;
    }
    // Implementation for calculatePerimeter (Perimeter = 2 * (length + width))
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 4. In the Main class:
public class Task15 {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle.
        Circle myCircle = new Circle("Blue", 5.0);
        Rectangle myRectangle = new Rectangle("Red", 4.0, 6.0);       
        // Use the interface type (Shape) for better polymorphism demonstration
        Shape genericCircle = myCircle;
        Shape genericRectangle = myRectangle;
        System.out.println("--- Shape Calculations ---");      
        // Display the area and perimeter for the Circle.
        System.out.println("\n**Circle** (Color: " + myCircle.getColor() + ", Radius: 5.0)");
        System.out.printf("Area: %.2f%n", genericCircle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", genericCircle.calculatePerimeter());
        // Display the area and perimeter for the Rectangle.
        System.out.println("\n**Rectangle** (Color: " + myRectangle.getColor() + ", Length: 4.0, Width: 6.0)");
        System.out.printf("Area: %.2f%n", genericRectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", genericRectangle.calculatePerimeter());
    }
}