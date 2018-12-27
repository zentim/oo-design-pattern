/**
 * Component
 */
public class Component() {
  public void doSomething() {
    System.out.println("Component doSomething!");
  }
}

/**
 * Decorator
 */
public class Decorator() {
  Component component;

  Decorator(Component component) {
    this.component = component;
  }

  public void doSomething() {
    addedFunction();
    component.doSomething();
  }

  public void addedFunction() {
    System.out.println("Decorator doSomething!");
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    Component component = new Component();
    Decorator decorator = new Decorator(component);
    decorator.doSomething();
  }
}
