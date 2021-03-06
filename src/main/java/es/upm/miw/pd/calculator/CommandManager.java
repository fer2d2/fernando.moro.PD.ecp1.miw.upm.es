package es.upm.miw.pd.calculator;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Command> comandos = new HashMap<>();

    public void add(Command comando) {
        this.comandos.put(comando.name(), comando);
    }

    public void execute(String key) {
        this.comandos.get(key).execute();
    }

    public String[] keys() {
        return this.comandos.keySet().toArray(new String[0]);
    }
}
