package es.upm.miw.pd.visitor.figure;

public class VisitorNumberOfSides implements Visitor {

    public double visitSquare(Square square) {
        return 4;
    }

    public double visitTriangle(Triangle triangle) {
        return 3;
    }

    public double visitCircle(Circle circle) {
        return Double.POSITIVE_INFINITY;
    }

}
