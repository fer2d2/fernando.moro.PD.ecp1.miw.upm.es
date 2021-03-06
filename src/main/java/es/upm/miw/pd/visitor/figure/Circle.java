package es.upm.miw.pd.visitor.figure;

public class Circle extends FigureWithDescription implements Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double accept(Visitor v) {
        return v.visitCircle(this);
    }
}
