package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class ComponenteCompuesto extends Componente {

    protected ArrayList<Componente> componentes = new ArrayList<Componente>();

    @Override
    public Boolean isCompuesto() {
        return true;
    }

    @Override
    public String dibujar(boolean uppercase) {
        String dibujo = obtenerDibujoDeComponentes(uppercase);
        return dibujo;
    }

    private String obtenerDibujoDeComponentes(boolean uppercase) {
        String dibujo = "";

        for (Componente componente : componentes) {
            dibujo += componente.dibujar(uppercase);
        }

        return dibujo;
    }

}
