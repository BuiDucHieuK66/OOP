package anothercircle;

public class Circle {
    private double radius;

    public Circle() {       //default constructor
        this.radius = 1.0;
    }

    public Circle(double radius) {        //not-default constructor
        this.radius = radius;
    }

    public double getRadius() {     //getter
        return this.radius;
    }

    public void setRadius(double radius) {      //setter
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle").append("[").append("radius = ").append(this.radius).append("]");

        return description.toString();
    }
}