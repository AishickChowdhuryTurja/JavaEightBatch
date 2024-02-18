package class3;

// Abstract class with abstract and final methods
abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Final method
    public final void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete class implementing the abstract class
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Instance method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Static method
    public static void printStaticInfo() {
        System.out.println("This is a static method in Circle class.");
    }
}

// Main class
public class MethodTypesExample {
    // Static method
    public static void main(String[] args) {
        // Instance method
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

        // Static method
        Circle.printStaticInfo();

        // Final method
        circle.displayInfo();
    }
}
