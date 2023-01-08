package visitor;

public interface Visitor {
    String visitDot(Dot d);
    String visitCircle(Circle c);
    String visitRectangle(Rectangle r);
    String visitCompoundGraphic(CompoundShape cs);
}
