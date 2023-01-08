package adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = squarePeg;
    }

    public double getRadius() {
        return Math.sqrt(2 * peg.getWidth() * peg.getWidth()) / 2;
    }
}
