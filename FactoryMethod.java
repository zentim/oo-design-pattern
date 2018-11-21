/**
 * Creator
 */
public abstract class Creator {
  public abstract Product factoryMethod();
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
public class ConcreteProduct1 extends Product {
  @Override
  public void doSomething() {
    System.out.println("ConcreteProduct1 doSomething");
  }
}

public class ConcreteProduct2 extends Product {
  @Override
  public void doSomething() {
    System.out.println("ConcreteProduct2 doSomething");
  }
}

// public class ConcreteProduct3 extends Product {
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
    Creator c1 = ConcreteCreator1();
    Creator c2 = ConcreteCreator2();
    // Creator c3 = ConcreteCreator3();

    Product p1 = c1.factoryMethod();
    Product p2 = c2.factoryMethod();
    // Product p3 = c3.factoryMethod();
  }
}
