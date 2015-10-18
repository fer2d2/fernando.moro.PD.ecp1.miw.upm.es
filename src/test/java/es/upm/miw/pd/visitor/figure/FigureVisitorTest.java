package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FigureVisitorTest {
    private Circle circle;

    private Square square;

    private Triangle triangle;

    @Before
    public void ini() {
        this.circle = new Circle("test description", 3.14);
        this.square = new Square("test description", 6);
        this.triangle = new Triangle("test description", 5.2, 7.4);
    }

    @Test
    public void testCircleArea() {
        assertEquals(30.974, circle.accept((Visitor) new VisitorArea()), 10e-3);
    }

    @Test
    public void testSquareArea() {
        assertEquals(36, square.accept((Visitor) new VisitorArea()), 0);
    }

    @Test
    public void testTriangleArea() {
        assertEquals(19.2, triangle.accept((Visitor) new VisitorArea()), 10e-1);
    }

    @Test
    public void testCircleNumberOfSides() {
        assertEquals(Double.POSITIVE_INFINITY, circle.accept((Visitor) new VisitorNumberOfSides()), 0);
    }

    @Test
    public void testSquareNumberOfSides() {
        assertEquals(4, square.accept((Visitor) new VisitorNumberOfSides()), 0);
    }

    @Test
    public void testTriangleNumberOfSides() {
        assertEquals(3, triangle.accept((Visitor) new VisitorNumberOfSides()), 0);
    }
}
