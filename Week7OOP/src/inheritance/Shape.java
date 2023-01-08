package inheritance;

public class Shape {
    protected String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFILLED() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Shape[color = ").append(this.color).append(", filled = ").append(this.filled).append("]");

        return str.toString();
    }

    public double getArea() {
        return 0.0;
    }
}