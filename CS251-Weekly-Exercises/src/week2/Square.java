package week2;

public class Square extends Rectangle {

    protected double side;

    public Square(){}

    public Square(double side){
        this.side = side;
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

    public void setWidth(double w){
        width = w;
    }

    public void setLength(double l){
        length = l;
    }

    @Override
    public String toString() {
        return "Square[sideLength=" + side + "]";
    }
}
