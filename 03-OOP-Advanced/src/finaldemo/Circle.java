package finaldemo;

public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }
}
