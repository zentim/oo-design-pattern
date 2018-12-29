package CommandAndMemento;

/**
 * 
 * Command Pattern - Client
 *
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command cmd = new PlusOneCommand(new Counter()); // operation is state++
        
        // test do
        invoker.execute(cmd);
        
        
        // test undo
        invoker.unExecute();
        
        // test do
        invoker.execute(cmd);
        
        
        // test redo
        invoker.recovery();
        
        
    }

}
