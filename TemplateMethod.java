/**
 * Template
 */
public abstract class Template {
  /* template method */
  public final void templateMethod() {
    operator1();
    operator2();
    operator3();
    hook();
  }

  /* primitive method */
  public abstract void operator1(); // This abstract method can use the factory method pattern.

  public void operator2() {
    System.out.println("Template: operator2"); // do default primitive implementation
  };

  /* hook method */
  public void hook() {
    // do nothing or do default hook implementation
  }
}

/**
 * ConcreteTemplate
 */
public class ConcreteTemplate extends Template {
  @Override
  public void operator1() {
    System.out.println("ConcreteTemplate: operator1");
  }

  @Override
  public void hook() {
    System.out.println("ConcreteTemplate: hook");
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    ConcreteTemplate ct = new ConcreteTemplate();
    ct.templateMethod();
  }
}
