package circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {       //default constructor
        this.radius = 1.0;
        this.color = "blue";
        System.out.println("default constructor calles.");
    }

    public Circle(double radius, String color) {        //not-default constructor
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {     //getter
        return this.radius;
    }

    public void setRadius(double radius) {      //setter
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle").append("[").append("radius = ").append(this.radius).append(", color = ").append(this.color).append("]");

        return description.toString();
    }
}