package thepointandtheline;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public String toString() {
        return "LineSub[begin = " + super.toString() + ", end = " + super.toString() + "]";
    }

    public Point getBegin() {
        return this.begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin = new Point(beginX, begin.getY());
    }

    public void setBeginY(int beginY) {
        this.begin = new Point(begin.getX(), beginY);
    }

    public void setEndX(int endX) {
        this.end = new Point(endX, end.getY());
    }

    public void setEndY(int endY) {
        this.end = new Point(end.getX(), endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin = new Point(beginX, beginY);
    }

    public void setEndXY(int endX, int endY) {
        this.end = new Point(endX, endY);
    }

    public int getLength() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return (int) Math.atan2(yDiff, xDiff);
    }
}