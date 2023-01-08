package inheritance;

public class ShapeManager {
    private int capability;
    private Shape[] shapes;
    private int availableIndex;

    public ShapeManager() {
        this.capability = 10;
        this.shapes = new Shape[this.capability];
        this.availableIndex = 0;
    }

    public void add(Shape shape) {
        this.shapes[availableIndex] = shape;
        this.availableIndex++;
    }

    public void printArea() {
        for (int i = 0; i < availableIndex; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println(((Circle)shapes[i]).getArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println(((Rectangle)shapes[i]).getArea());
            }
        }

        for (int i = 0; i < availableIndex; i++) {
            System.out.println(shapes[i].getArea());
        }
    }

    public Circle[] filterCircle() {
        Circle[] circles = new Circle[shapes.length];
        int appendAt = 0;
        for (int i = 0; i < availableIndex; i++) {
            if (shapes[i] instanceof Circle) {
                circles[appendAt] = (Circle) shapes[i];
                appendAt++;
            }
        }
        return circles;
    }

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        Circle shape1 = new Circle();
        shapeManager.add(shape1);

        Rectangle shape2 = new Rectangle();
        shapeManager.add(shape2);

        int test = 0;
    }
}