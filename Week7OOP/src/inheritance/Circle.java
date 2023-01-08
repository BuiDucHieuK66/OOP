package inheritance;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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