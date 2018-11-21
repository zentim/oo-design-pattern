/**
 * Creator
 */
public abstract class Creator {
  public static Product factoryMethod(String type) {
    switch(type) {
      case "product1":
        return new ConcreteProduct1();
      case "product2":
        return new ConcreteProduct2();
      // case "product3":
      //   return new ConcreteProduct3();
      default:
        return null;
    }
  }
}

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
 * stpe 2: modify Creator class
 */
public class Client {
  public static void main(String[] args) {
    Creator c = Creator();

    Product p1 = c.factoryMethod("product1");
    Product p2 = c.factoryMethod("product2");
    // Product p3 = c.factoryMethod("product3");
  }
}
