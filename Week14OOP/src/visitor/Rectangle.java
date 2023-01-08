package visitor;

public class Rectangle implements Shape {
    private int id, x, y, height, width;

    public Rectangle(int id, int x, int y, int height, int width) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drew!");
    }
}
