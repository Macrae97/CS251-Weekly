package week2;

public class Square extends Rectangle {

    protected double side;

    public Square(){}

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square[sideLength=" + side + "]";
    }
}
