package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class AddCommand extends CommandGeneric {

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Add";
    }

    @Override
    public void execute() {
        int valor = IO.getIO().readInt();
        this.calculator.add(valor);
    }

}
