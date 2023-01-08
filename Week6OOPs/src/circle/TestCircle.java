package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("The circle has radius of " + circle1.getRadius() + ", color of " + circle1.getColor() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0, "red");

        System.out.println("The circle has radius of " + circle2.getRadius() + ", color of " + circle2.getColor() + " and area of " + circle2.getArea());

        Circle circle3 = new Circle();

        circle3.setRadius(5.5);
        System.out.println("Radius is: " + circle3.getRadius());

        circle3.setColor("green");
        System.out.println("color is: " + circle3.getColor());

        System.out.println(circle3.toString());
    }
}