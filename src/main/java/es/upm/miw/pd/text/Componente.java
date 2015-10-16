package es.upm.miw.pd.text;

public abstract class Componente {

    public abstract void add(Componente componente);
    
    public abstract String dibujar(Boolean uppercase);
    
    public abstract Boolean isCompuesto();

}
