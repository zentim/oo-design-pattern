/**
 * Creator
 */
// One Creator can only create one Product, but we can have different type creator..
public abstract class Creator {
  // /* template method */
  // public final void templateMethod() {
  //   Product p = factoryMethod(); // Factory method is often called from a template method.
  // }

  // /* primitive method */
  public abstract Product factoryMethod(); // In the template pattern, factoryMethod is primitive method.
}

/**
 * ConcreteCreator
 */
public class ConcreteCreator1 extends Creator {
  @Override
  public Product factoryMethod() {
    return new ConcreteProduct1();
  }
}

public class ConcreteCreator2 extends Creator {
  @Override
  public Product factoryMethod() {
    return new ConcreteProduct2();
  }
}

// public class ConcreteCreator3 extends Creator {
//   @Override
//   public Product factoryMethod() {
//     return new ConcreteProduct3();
//   }
// }


/**
 * Product
 */
public interface Product {
  void doSomething();
}

/**
 * ConcreteProduct
 */
public class ConcreteProduct1 implements Product {
  @Override
  public void doSomething() {
    System.out.println("ConcreteProduct1 doSomething");
  }
}

public class ConcreteProduct2 implements Product {
  @Override
  public void doSomething() {
    System.out.println("ConcreteProduct2 doSomething");
  }
}

// public class ConcreteProduct3 implements Product {
//   @Override
//   public void doSomething() {
//     System.out.println("ConcreteProduct3 doSomething");
//   }
// }

/**
 * Client
 *
 * If want to add a product type, need to:
 * step 1: add a ConcreateProduct class
 * stpe 2: add a ConcreateCreator class
 */
public class Client {
  public static void main(String[] args) {
    private Creator creator;

    // Creator1
    creator = ConcreteCreator1();
    private Product product1 = creator.factoryMethod();

    // Creator2
    creator = ConcreteCreator2();
    private Product product2 = creator.factoryMethod();

    // // Creator3
    // creator = ConcreteCreator3();
    // private Product product3 = creator.factoryMethod();
  }
}
