/**
 * Handler
 */
public abstract class Handler {
    private Handler nextHandler;

    abstract void handleRequest(int request);

    /* Getter and Setter */
    public Handler getNextHandler() {
        return nextHandler;
    }
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

/**
 * ConcreteHandler
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        System.out.println("no process");
    }
}

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request > 0) {
            System.out.println("request > 0");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Handler ch1 = new ConcreteHandler1();
        Handler ch2 = new ConcreteHandler2();

        ch2.setNextHandler(ch1);
        ch2.handleRequest(100);
    }
}
