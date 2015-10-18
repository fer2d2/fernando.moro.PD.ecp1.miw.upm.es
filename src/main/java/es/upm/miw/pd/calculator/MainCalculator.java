package es.upm.miw.pd.calculator;

import upm.jbb.IO;

public class MainCalculator {
    private CommandManager commandManager;

    public MainCalculator() {
        CalculatorMementable calculator = new CalculatorMementable();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new UndoCommand(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }
}
