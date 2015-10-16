package es.upm.miw.pd.visitor.figure;

public class Visitor2 extends Visitor {

    private int numberOfAs = 0;

    private int numberOfBs = 0;

    @Override
    public void visitElementA(ElementA e) {
        this.numberOfAs++;
    }

    @Override
    public void visitElementB(ElementB e) {
        this.numberOfBs++;
    }

    public int getAs() {
        return numberOfAs;
    }

    public int getBs() {
        return numberOfBs;
    }

}
