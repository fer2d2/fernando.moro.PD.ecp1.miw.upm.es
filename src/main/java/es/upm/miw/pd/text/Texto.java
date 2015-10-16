package es.upm.miw.pd.text;

public class Texto extends ComponenteCompuesto {

    private final String separador = "---o---\n";

    @Override
    public void add(Componente componente) {

        if (!componente.isCompuesto()) {
            throw new UnsupportedOperationException("Solo se deberian introducir elementos compuestos");
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
