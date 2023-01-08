package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg) + "");

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg bigSquarePeg = new SquarePeg(10);
        hole.fits(new SquarePegAdapter(smallSquarePeg));
    }
}
