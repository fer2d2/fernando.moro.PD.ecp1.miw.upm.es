package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class PrintCommand extends CommandGeneric {
    public PrintCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Print";
    }

    @Override
    public void execute() {
        int valor = this.calculator.getTotal();
        IO.getIO().println(valor);
    }
}
