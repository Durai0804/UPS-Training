abstract class Shape {
    abstract double area();
    abstract String getName();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    String getName() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return base * height / 2;
    }

    @Override
    String getName() {
        return "Triangle";
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(7),
            new Rectangle(5, 4),
            new Triangle(6, 8)
        };

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.getName(), shape.area());
        }
    }
}
