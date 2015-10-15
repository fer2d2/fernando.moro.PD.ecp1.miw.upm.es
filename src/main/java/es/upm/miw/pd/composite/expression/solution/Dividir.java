package es.upm.miw.pd.composite.expression.solution;

public class Dividir extends Operacion {
    public Dividir(Expresion elemento1, Expresion elemento2) {
        super(elemento1, elemento2);
    }

    @Override
    public int operar() {
        return this.elemento1.operar() / this.elemento2.operar();
    }
}
