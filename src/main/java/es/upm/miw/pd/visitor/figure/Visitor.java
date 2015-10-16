package es.upm.miw.pd.visitor.figure;

public interface Visitor {
    
    public abstract void visitSquareArea(Square square);

    public abstract void visitSquareNumberOfSides(Square square);
    
    public abstract void visitTriangleArea(Triangle triangle);

    public abstract void visitTriangleNumberOfSides(Triangle triangle);
    
    public abstract void visitCircleArea(Circle circle);

    public abstract void visitCircleNumberOfSides(Circle circle);
    
}
