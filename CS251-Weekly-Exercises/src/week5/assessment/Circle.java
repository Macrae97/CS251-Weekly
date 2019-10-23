package week5.assessment;

public class Circle {

    private double radius;
    private String color;

    // Constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    // Return the area of this Circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

