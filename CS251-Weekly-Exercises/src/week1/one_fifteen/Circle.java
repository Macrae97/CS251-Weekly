package week1.one_fifteen;

public class Circle {

    private String colour;
    private double radius;

    public Circle(){
        this.colour  = "red";
        this.radius  = 1.8;
    }

    public Circle(double radius) {
        this.colour = "red";
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public String setColour(double d){

        if (d < 0 ){
            return "Please enter a valid number more than 0";
        }else if (d >= 0 && d <= 5){
            this.colour = "red";
        }else if (d >= 6 && d <= 10){
            this.colour = "amber";
        }else if (d >= 11 && d <= 15){
            this.colour = "green";
        }else if (d >= 16 && d <= 20){
            this.colour = "white";
        }else if (d >= 21 && d <= 25){
            this.colour = "green";
        }else if(d > 25){
            this.colour = "black";
        }

        return colour;
    }

    public String setColourBasic(double d){

        if (d < 10){
            this.colour = "red";
        }else if (d >= 10 && d < 50){
            this.colour = "amber";
        }else if (d >= 50){
            this.colour = "green";
        }

        return colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "colour='" + colour + '\'' +
                ", radius=" + radius +
                '}';
    }
}
