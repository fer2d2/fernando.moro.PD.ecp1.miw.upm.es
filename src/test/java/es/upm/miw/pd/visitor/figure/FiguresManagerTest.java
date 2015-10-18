package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiguresManagerTest {
    private FiguresManager figuresManager;

    @Before
    public void ini() {
        this.figuresManager = new FiguresManager();
        this.figuresManager.add(new Square("test description", 6));
        this.figuresManager.add(new Triangle("test description", 5.2, 7.4));
    }

    @Test
    public void testTotalArea() {
        assertEquals(55.24, figuresManager.totalArea(), 0);
    }

    @Test
    public void testTotalAreaEmpty() {
        FiguresManager figuresManager2 = new FiguresManager();
        assertEquals(0, figuresManager2.totalArea(), 0);
    }

    @Test
    public void testNumberOfSides() {
        assertEquals(7.0, figuresManager.totalNumberOfSides(), 0);
    }

    @Test
    public void testNumberOfSidesWithCircle() {
        this.figuresManager.add(new Circle("test description", 3));
        assertEquals(Double.POSITIVE_INFINITY, figuresManager.totalNumberOfSides(), 0);
    }

    @Test
    public void testNumberOfSidesEmpty() {
        FiguresManager figuresManager2 = new FiguresManager();
        assertEquals(0, figuresManager2.totalNumberOfSides(), 0);
    }
}
