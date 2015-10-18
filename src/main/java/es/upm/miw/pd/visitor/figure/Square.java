package es.upm.miw.pd.visitor.figure;

public class Square extends Figure {

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

}
