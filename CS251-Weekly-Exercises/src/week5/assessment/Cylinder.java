package week5.assessment;

public class Cylinder extends Circle {

    // private instance variable
    private double height;

    // Constructors
    public Cylinder() {
        super();  // invoke superclass' constructor Circle()
        this.height = 1.0;
    }
    public Cylinder(double height) {
        super();  // invoke superclass' constructor Circle()
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);  // invoke superclass' constructor Circle(radius)
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);  // invoke superclass' constructor Circle(radius, color)
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Return the volume of this Cylinder
    public double getVolume() {
        return getArea()*height;   // Use Circle's getArea()
    }

    public String toString() {
        return "Cylinder with Radius " + getRadius() +
                ", Height " + getHeight() +
                ", Color " + getColor() +
                ", Base area is " + getArea() +
                ", Volume is " + getVolume() + ". ";
    }
}
