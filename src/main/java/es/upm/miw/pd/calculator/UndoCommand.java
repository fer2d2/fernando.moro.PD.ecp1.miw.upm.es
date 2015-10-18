package es.upm.miw.pd.calculator;

public class UndoCommand extends CommandGenericMementable {

    public UndoCommand(CalculatorMementable calculatorMementable) {
        super(calculatorMementable);
    }

    @Override
    public String name() {
        return "Undo";
    }

    @Override
    public void execute() {
        this.getCalculatorMementable().undo();
    }

}
