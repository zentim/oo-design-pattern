/**
 * Target
 */
public interface Target {
  void request();
}

/**
 * Adaptee
 */
public interface Adaptee {
  void existRequest();
}

/**
 * ConcreteAdaptee
 */
public class ConcreteAdaptee1 implements Adaptee {
  public void existRequest() {
    System.out.println("Adaptee's existRequest");
  }
}

public class ConcreteAdaptee2 implements Adaptee {
  public void existRequest() {
    System.out.println("Adaptee's existRequest");
  }
}

/**
 * ObjectAdapter
 */
public class ObjectAdapter implements Target {
  private Adaptee adaptee;

  public ObjectAdapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public void request() {
    adaptee.existRequest();
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    // Test Target can use Adaptee
    Target adapter = new ObjectAdapter(new ConcreteAdaptee1());
    adapter.request(); // Adaptee's existRequest
  }
}
