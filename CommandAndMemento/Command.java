package CommandAndMemento;

/**
 * 
 * Command Pattern - Command
 *
 */
public interface Command {

    void doAction();
    void undo();
    void redo();

}
