package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class SubtractCommand extends ComandoGenerico {

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
