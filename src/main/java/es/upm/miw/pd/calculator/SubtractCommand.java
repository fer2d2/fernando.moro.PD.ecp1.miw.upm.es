package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class SubtractCommand extends CommandGeneric {

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Subtract";
    }

    @Override
    public void execute() {
        int valor = IO.getIO().readInt();
        this.calculator.subtract(valor);
    }

}
