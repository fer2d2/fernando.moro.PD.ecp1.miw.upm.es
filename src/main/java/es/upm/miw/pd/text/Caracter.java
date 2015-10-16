package es.upm.miw.pd.text;

public class Caracter extends Componente {

    private char caracter;
    
    public Caracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public void add(Componente componente) {
    }

    @Override
    public String dibujar(Boolean uppercase) {
        String dibujo = String.valueOf(this.caracter);
        
        if(uppercase) {
            return dibujo.toUpperCase();
        }
        
        return dibujo;
    }

    @Override
    public Boolean isCompuesto() {
        return false;
    }

}
