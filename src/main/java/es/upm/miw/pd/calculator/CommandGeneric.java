package es.upm.miw.pd.calculator;

public abstract class CommandGeneric implements Command {
    protected Calculator calculator;

    public CommandGeneric(Calculator calculator) {
        this.calculator = calculator;
    }
}
