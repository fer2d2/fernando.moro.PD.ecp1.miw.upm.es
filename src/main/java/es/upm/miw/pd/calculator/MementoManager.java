package es.upm.miw.pd.calculator;

import java.util.HashMap;
import java.util.Map;

public class MementoManager<T> {
    private Map<String, T> backups;

    public MementoManager() {
        this.backups = new HashMap<String, T>();
    }
    
    public void addMemento(String key, T memento) {
        this.backups.put(key, memento);
    }
    
    public T getMemento(String key){
        return this.backups.get(key);
    }
    
    public String[] keys() {
        return this.backups.keySet().toArray(new String[0]);
    }
}
