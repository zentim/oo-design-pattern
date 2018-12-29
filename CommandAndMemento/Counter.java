package CommandAndMemento;

/**
 * 
 * Command Pattern - Receiver
 * Memento Pattern - Originator
 *
 */
public class Counter {
    private int state = 0;
    
    public int getState() {
        return state;
    }
    
    
    /**
     * Command Pattern - Receiver's method : operation()
     */
    public void plusOne() {
        state++;
    }
    
    
    /**
     * Memento Pattern - Originator's method
     */
    public Memento saveToMemento() {
        Memento m = new Memento();
        m.setState(state);
        
        return m;
    }
    
    public void restoreFromMemento(Memento m) {
        state = m.getState();
    }


}
