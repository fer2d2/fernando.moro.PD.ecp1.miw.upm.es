package es.upm.miw.pd.visitor.figure;

public class Square extends FigureWithDescription implements Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double accept(Visitor v) {
        return v.visitSquare(this);
    }
}
