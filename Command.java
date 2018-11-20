// Invoker
public class Invoker {
  private Stack<Command> history = new Stack<Command>();

  public void storeAndExecute(Command cmd) {
    history.add(cmd);
    cmd.execute();
  }

  public void undo() {
    if (!history.isEmpty()) {
      Command cmd = history.pop();
      cmd.unExecute();
    } else {
      System.out.println("Undo fail, no command record!");
    }
  }
}


// Receiver
public class Receiver {
  public void action1() {
    System.out.println("Receiver do action1.");
  }

  public void action2() {
    System.out.println("Receiver do action2.");
  }
}


// Command
public interface Command {
  public void execute();
  public void unExecute();
}


// ConcreteCommand
public class ConcreteCommand1 implements Command {
  Receiver receiver;

  ConcreteCommand1(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action1();
  }

  @Override
  public void UnExecute() {
    // undo receiver action1
  }
}

public class ConcreteCommand2 implements Command {
  Receiver receiver;

  ConcreteCommand2(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action2();
  }

  @Override
  public void UnExecute() {
    // undo receiver action2
  }
}


// Client
public class Client {
  public static void main(String[] args) {
    Invoker invoker = new invoker();
    Receiver receiver = new Receiver();
    ConcreteCommand1 cc1 = new ConcreteCommand1(receiver);
    ConcreteCommand2 cc2 = new ConcreteCommand2(receiver);

    invoker.storeAndExecute(cc1);
    invoker.storeAndExecute(cc2);

    invoker.undo();
    invoker.undo();
  }
}

