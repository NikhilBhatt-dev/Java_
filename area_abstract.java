abstract class Shape {
    abstract void draw();
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing a Circle");
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    double area() {
        return length * width;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void draw() {
        System.out.println("Drawing a Square");
    }

    double area() {
        return side * side;
    }
}

public class area_abstract {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        circle.draw();
        System.out.println("Circle Area: " + circle.area());

        rectangle.draw();
        System.out.println("Rectangle Area: " + rectangle.area());

        square.draw();
        System.out.println("Square Area: " + square.area());
    }
}
