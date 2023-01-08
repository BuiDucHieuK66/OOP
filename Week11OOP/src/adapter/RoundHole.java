package adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {

    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
