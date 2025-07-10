abstract class Shape {
    abstract void area();
    abstract void display();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void area() {
        double resultC = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + resultC);
    }

    public void display() {
        System.out.println("The given RADIUS value is: (" + radius + ")");
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void area() {
        double resultR = length * breadth;
        System.out.println("The area of the rectangle is: " + resultR);
    }

    public void display() {
        System.out.println("The given values to calculate for Rectangle are: Length = " + length + ", Breadth = " + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        // For circle
        Circle c1 = new Circle(5.0);
        System.out.println("Circle:");
        c1.display();
        c1.area();

        // For rectangle
        Rectangle r1 = new Rectangle(10.0, 5.0);
        System.out.println("\nRectangle:");
        r1.display();
        r1.area();
    }
}