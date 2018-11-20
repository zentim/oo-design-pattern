// Acceptor
public interface Acceptor {
  public void accept(Visitor v);
}


// ConcreteAcceptor
public class ConcreteAcceptor1 implements Acceptor {
  public void accept(Visitor v) {
    v.visit(this);
  }
}

public class ConcreteAcceptor2 implements Acceptor {
  public void accept(Visitor v) {
    v.visit(this);
  }
}

public class ConcreteAcceptor3 implements Acceptor {
  public void accept(Visitor v) {
    v.visit(this);
  }
}


// Visitor
public abstract class Visitor {
  public abstract void visit(ConcreteAcceptor1 ca1);
  public abstract void visit(ConcreteAcceptor2 ca2);
  public abstract void visit(ConcreteAcceptor3 ca3);
}


// ConcreteVisitor
public ConcreteVisitor1 extends Visitor {
  @Override
  public void visit(ConcreteAcceptor1 ca1) {
    System.out.println(ca1);
  }

  @Override
  public void visit(ConcreteAcceptor2 ca2) {
    System.out.println(ca2);
  }

  @Override
  public void visit(ConcreteAcceptor2 ca3) {
    System.out.println(ca3);
  }
}

public ConcreteVisitor2 extends Visitor {
  @Override
  public void visit(ConcreteAcceptor1 ca1) {
    System.out.println(ca1);
  }

  @Override
  public void visit(ConcreteAcceptor2 ca2) {
    System.out.println(ca2);
  }

  @Override
  public void visit(ConcreteAcceptor2 ca3) {
    System.out.println(ca3);
  }
}


// Client
public class Client {
  public static void main(String[] args) {

    ConcreteAcceptor1 ca1 = new ConcreteAcceptor1();
    ConcreteAcceptor2 ca2 = new ConcreteAcceptor2();
    ConcreteAcceptor3 ca3 = new ConcreteAcceptor3();

    ConcreteVisitor1 cv1 = new ConcreteVisitor1();
    ConcreteVisitor2 cv2 = new ConcreteVisitor2();

    ca1.accept(cv1);
    ca1.accept(cv2);

    ca2.accept(cv1);
    ca2.accept(cv2);

    ca3.accept(cv1);
    ca3.accept(cv2);

  }
}

