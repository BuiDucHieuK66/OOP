package geometricobj;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Rectangle[width = " + this.width + ", length = " + this.length + "]");
        return str.toString();
    }
}
