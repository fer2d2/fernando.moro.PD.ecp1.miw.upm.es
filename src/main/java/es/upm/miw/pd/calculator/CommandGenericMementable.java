package es.upm.miw.pd.calculator;

public abstract class CommandGenericMementable implements Command {
    private CalculatorMementable calculatorMementable;

    public CommandGenericMementable(CalculatorMementable calculatorMementable) {
        this.calculatorMementable = calculatorMementable;
    }

    public CalculatorMementable getCalculatorMementable() {
        return calculatorMementable;
    }

    public void setCalculatorMementable(CalculatorMementable calculatorMementable) {
        this.calculatorMementable = calculatorMementable;
    }
}
