package es.upm.miw.pd.visitor.figure;

public interface Visitor {

    public abstract double visitSquare(Square square);

    public abstract double visitTriangle(Triangle triangle);

    public abstract double visitCircle(Circle circle);

}
