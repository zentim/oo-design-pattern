/**
 * Creator
 */
// One Creator can only create one Product, but Product can be any type.
public class Creator {
  public Product factoryMethod(String type) {
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
 * stpe 2: modify Creator class
 */
public class Client {
  public static void main(String[] args) {
    Creator creator = Creator();

    Product product1 = creator.factoryMethod("product1");
    Product product2 = creator.factoryMethod("product2");
    // Product product3 = creator.factoryMethod("product3");
  }
}
