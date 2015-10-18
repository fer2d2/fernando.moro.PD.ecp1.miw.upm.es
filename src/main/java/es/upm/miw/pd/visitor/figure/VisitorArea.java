package es.upm.miw.pd.visitor.figure;

public class VisitorArea implements Visitor {
    
    public double visitSquare(Square square) {
        return square.getSide() * square.getSide();
    }
    
    public double visitTriangle(Triangle triangle) {
        return triangle.getBase() * triangle.getHeight() * 0.5;
    }
    
    public double visitCircle(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}
