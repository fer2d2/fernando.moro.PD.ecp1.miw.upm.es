package es.upm.miw.pd.calculator;

public class Memento {
    private int quantity;

    public Memento(int quantity) {
        super();
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
