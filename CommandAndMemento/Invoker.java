package CommandAndMemento;

import java.util.Stack;

/**
 * 
 * Command Pattern - Command
 * Memento Pattern - Client
 *
 */
public class Invoker {
    private Stack<Command> executedCommands = new Stack<Command>();
    private Stack<Command> undoneCommands = new Stack<Command>();
    private boolean canReverse = false;

    public void execute(Command cmd) {
        executedCommands.add(cmd);
        cmd.doAction();
        canReverse = false;
    }
    
    public void unExecute() {
        if (!executedCommands.empty()) {
            Command executedCommand = executedCommands.pop();
            undoneCommands.add(executedCommand);
            executedCommand.undo();
            canReverse = true;
        } else {
            System.out.println("executedCommands is empty, can not undo!");
        }
    }
    
    public void recovery() {
        if (!undoneCommands.empty() && canReverse) {
            Command undoneCommand = undoneCommands.pop();
            executedCommands.add(undoneCommand);
            undoneCommand.redo();
        } else {
            System.out.println("undoneCommands is empty, can not redo!");
        }
    }

}
