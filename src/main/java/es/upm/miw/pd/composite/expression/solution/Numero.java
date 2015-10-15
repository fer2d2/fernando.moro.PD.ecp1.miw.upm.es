package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int operar() {
        return this.valor;
    }
}
