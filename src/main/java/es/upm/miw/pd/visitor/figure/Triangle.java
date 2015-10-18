package es.upm.miw.pd.visitor.figure;

public class Triangle extends FigureWithDescription implements Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double accept(Visitor v) {
        return v.visitTriangle(this);
    }

}
