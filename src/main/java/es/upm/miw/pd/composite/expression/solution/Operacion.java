package es.upm.miw.pd.composite.expression.solution;

abstract class Operacion extends Expresion {
    Expresion elemento1;

    Expresion elemento2;

    public Operacion(Expresion elemento1, Expresion elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }
}
