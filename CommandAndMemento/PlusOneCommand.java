package CommandAndMemento;

/**
 * 
 * Command Pattern - ConcreteCommand
 * Memento Pattern - Caretaker
 *
 */
public class PlusOneCommand implements Command {
    private Counter receiver;
    private Memento memento; // Caretaker maintain an instance of Memento

    public PlusOneCommand(Counter receiver) {
        this.receiver = receiver;
    }

    
    
    /**
     * Command Pattern - ConcreteCommand's method
     */
    @Override
    public void doAction() {
        System.out.println("before do: " + receiver.getState());
        
        memento = receiver.saveToMemento();
        receiver.plusOne();
        
        System.out.println("after do: " + receiver.getState());
    }

    @Override
    public void undo() {
        System.out.println("before undo: " + receiver.getState());
        
        Memento temp = receiver.saveToMemento(); 
        receiver.restoreFromMemento(memento);
        memento = temp;
        
        System.out.println("after undo: " + receiver.getState());
    }

    @Override
    public void redo() {
        System.out.println("before redo: " + receiver.getState());
        
        Memento temp = receiver.saveToMemento(); 
        receiver.restoreFromMemento(memento);
        memento = temp;
        
        System.out.println("after redo: " + receiver.getState());
    }

}
