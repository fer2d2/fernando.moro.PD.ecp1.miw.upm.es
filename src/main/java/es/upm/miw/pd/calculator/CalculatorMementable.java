package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class CalculatorMementable extends Calculator {
    private MementoManager<Memento> mementoManager;

    public CalculatorMementable() {
        super();
        this.mementoManager = new MementoManager<Memento>(); 
    }
    
    public void save(String key) {
        this.mementoManager.addMemento(key, new Memento(this.getTotal()));
    }
    
    public void undo() {
        String selectedKey = (String) IO.getIO().select(mementoManager.keys());
        int total = this.mementoManager.getMemento(selectedKey).getQuantity();
        this.setTotal(total);
    }
}
