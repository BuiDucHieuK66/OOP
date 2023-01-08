package thepointandtheline;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(11);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line2 = new Line(p1, p2);
        System.out.println(12);
    }
}