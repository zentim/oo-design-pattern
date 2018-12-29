/**
 * Target
 */
public interface Target {
  void request();
}

/**
 * Adaptee
 */
public class Adaptee {
  public void existRequest() {
    System.out.println("Adaptee's existRequest");
  }
}

/**
 * ClassAdapter
 */
public class ClassAdapter extends Adaptee implements Target {
  public void request() {
    this.existRequest();
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    // Test Target can use Adaptee
    Target adapter = new ClassAdapter();
    adapter.request(); // Adaptee's existRequest
  }
}
