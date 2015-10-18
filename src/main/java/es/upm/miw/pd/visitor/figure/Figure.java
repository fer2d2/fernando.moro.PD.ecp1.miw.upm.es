package es.upm.miw.pd.visitor.figure;

public interface Figure {

    public abstract double accept(Visitor v);

}
