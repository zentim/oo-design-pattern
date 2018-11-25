/**
 * Template
 */
public abstract class Template {
  /* template method */
  public final void templateMethod() {
    operator1();
    operator2();
    hook();
  }

  /* primitive method */
  public void primitive1() {
      System.out.println("Template: primitive1"); // do default primitive implementation
  }

  public abstract void primitive2(); // This abstract method can use the factory method pattern.

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
  public void primitive2() {
    System.out.println("ConcreteTemplate: primitive2");
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
