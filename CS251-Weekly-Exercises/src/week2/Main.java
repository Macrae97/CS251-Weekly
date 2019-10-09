package week2;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.0, 3.0, "Green", true);
        Square square = new Square(4.0, "red", false);
        Circle circle = new Circle(3.0, "blue", true);

        //Test the outputs of each shape and check each class overrides the methods of its super
        System.out.println(rectangle.toString() + " has an area of " + rectangle.getArea() + " and a perimeter of " + rectangle.getPerimeter());
        System.out.println(square.toString() + " has an area of " + square.getArea() + " and a perimeter of " + square.getPerimeter());
        System.out.println(circle.toString() + " has an area of " + circle.getArea() + " and a perimeter of " + circle.getPerimeter());
    }
}
