package visitorex2;

public class Computer implements ComputerPart{
    private ComputerPart[] parts;

    public Computer(ComputerPart... parts) {
        this.parts = parts;
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        for (ComputerPart part : parts) {
            part.accept(v);
        }

        v.visit(this);
    }
}
