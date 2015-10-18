package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class SaveCommand extends CommandGenericMementable {

    public SaveCommand(CalculatorMementable calculatorMementable) {
        super(calculatorMementable);
    }

    @Override
    public String name() {
        return "Save";
    }

    @Override
    public void execute() {
        String saveKey = IO.getIO().readString();
        this.getCalculatorMementable().save(saveKey);
    }

}
