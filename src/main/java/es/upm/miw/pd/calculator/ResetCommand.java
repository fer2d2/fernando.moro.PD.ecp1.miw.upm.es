package es.upm.miw.pd.calculator;

public class ResetCommand extends ComandoGenerico {

    public ResetCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String name() {
        return "Reset";
    }

    @Override
    public void execute() {
        this.calculator.reset();
    }

}
