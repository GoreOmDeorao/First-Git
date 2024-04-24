abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementation of abstract method
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementation of abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

