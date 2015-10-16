package es.upm.miw.pd.text;

import java.util.HashMap;

public class FactoriaCaracter {

    private static FactoriaCaracter factoriaCaracter;
    
    private HashMap<Character, Caracter> caracteres;
    
    private FactoriaCaracter() {
        this.caracteres = new HashMap<Character, Caracter>();
    }

    public static FactoriaCaracter getFactoria() {
        if(FactoriaCaracter.factoriaCaracter == null) {
            FactoriaCaracter.factoriaCaracter = new FactoriaCaracter(); 
        }
        
        return FactoriaCaracter.factoriaCaracter;
    }

    public Caracter get(char c) {
        Caracter caracter = caracteres.get(new Character(c));
        caracter = addCaracterToCaracteresIfNotPresent(c, caracter);
        return caracter;
    }

    private Caracter addCaracterToCaracteresIfNotPresent(char c, Caracter caracter) {
        if(caracter == null){
            caracter = new Caracter(Character.valueOf(c));
            caracteres.put(Character.valueOf(c), caracter);
        }
        return caracter;
    }

}
