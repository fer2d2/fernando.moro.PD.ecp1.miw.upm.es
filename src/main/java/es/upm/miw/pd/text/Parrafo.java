package es.upm.miw.pd.text;

public class Parrafo extends ComponenteCompuesto {
    
    private final String separador = "\n";
    
    @Override
    public void add(Componente componente) {
        
        if(componente.isCompuesto()) {
            throw new UnsupportedOperationException("No se pueden introducir elementos compuestos");
        }
        
        this.componentes.add(componente);
    }

    @Override
    public String dibujar(boolean uppercase) {
        String resultado = super.dibujar(uppercase);
        resultado += this.separador;
        return resultado;
    }

}
