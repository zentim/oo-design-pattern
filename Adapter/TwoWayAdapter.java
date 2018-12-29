/**
 * Target
 */
public interface Target {
  void request();
}

/**
 * ConcreteTarget
 */
public class ConcreteTarget {
  public void request() {
    System.out.println("Target's request");
  }
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
public class ConcreteAdaptee implements Adaptee {
  public void existRequest() {
    System.out.println("Adaptee's existRequest");
  }
}


/**
 * TwoWayAdapter
 */
public class TwoWayAdapter implements Target, Adaptee {
  private Target target = new ConcreteTarget();
  private Adaptee adaptee = new ConcreteAdaptee();

  public TwoWayAdapter(Target obj) {
    target = obj;
  }

  public TwoWayAdapter(Adaptee obj) {
    adaptee = obj;
  }

  public void request() {
    if (target) {
      target.request();
    }
    if (adaptee) {
      adaptee.existRequest();
    }
  }

  public void existRequest() {
    this.request();
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    // Test Target can transform to Adaptee
    Target adapter1 = new TwoWayAdapter(new ConcreteAdaptee());
    adapter.request(); // Adaptee's existRequest
    adapter.existRequest(); // Adaptee's existRequest

    // Test Adaptee can transform to Target
    Adaptee adapter2 = new TwoWayAdapter(new ConcreteTarget());
    adapter.request(); // Target's request
    adapter.existRequest(); // Target's request

  }
}
