package week2;

public class Circle extends Shape{

    protected double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public Circle(double r, String c, boolean f) {
        radius = r;
        color = c;
        filled = f;
    }

    // A public method for retrieving the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
