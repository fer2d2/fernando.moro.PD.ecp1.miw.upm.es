package es.upm.miw.pd.calculator;

public abstract class ComandoGenerico implements Comando {
    protected Calculator calculator;

    public ComandoGenerico(Calculator calculator) {
        this.calculator = calculator;
    }
}
