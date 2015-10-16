package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumberCreator naturalNumberCreator;

    private NaturalNumber naturalNumber;

    public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
        this.naturalNumberCreator = naturalNumberCreator;
    }

    public void createNaturalNumber(int number) {
        this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(number);
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }
}
