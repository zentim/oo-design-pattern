/**
 * AbstractFactory
 */
// One Factory can create at least two Products.
public abstract class Factory {
  public abstract Product factoryMethodTypeX();
  public abstract Product factoryMethodTypeY();
}

/**
 * ConcreteFactory
 */
public class ConcreteFactory1 extends Factory {
  @Override
  public Product factoryMethodTypeX() {
    return new ConcreteProductTypeX1();
  }

  @Override
  public Product factoryMethodTypeY() {
    return new ConcreteProductTypeY1();
  }
}

public class ConcreteFactory2 extends Factory {
  @Override
  public Product factoryMethodTypeX() {
    return new ConcreteProductTypeX2();
  }

  @Override
  public Product factoryMethodTypeY() {
    return new ConcreteProductTypeY2();
  }
}

// public class ConcreteFactory3 extends Factory {
//   @Override
//   public Product factoryMethodTypeX() {
//     return new ConcreteProductTypeX3();
//   }

//   @Override
//   public Product factoryMethodTypeY() {
//     return new ConcreteProductTypeY3();
//   }
// }


/**
 * Product
 */
public interface ProductTypeX {
  void doSomethingX();
}

public interface ProductTypeY {
  void doSomethingY();
}

/**
 * ConcreteProduct
 */
public class ConcreteProductTypeX1 implements ProductTypeX {
  @Override
  public void doSomethingX() {
    System.out.println("ConcreteProductTypeX1 doSomething");
  }
}

public class ConcreteProductTypeX2 implements ProductTypeX {
  @Override
  public void doSomethingX() {
    System.out.println("ConcreteProductTypeX2 doSomething");
  }
}

// public class ConcreteProductTypeX3 implements ProductTypeX {
//   @Override
//   public void doSomethingX() {
//     System.out.println("ConcreteProductTypeX3 doSomething");
//   }
// }

public class ConcreteProductTypeY1 implements ProductTypeY {
  @Override
  public void doSomethingY() {
    System.out.println("ConcreteProductTypeY1 doSomething");
  }
}

public class ConcreteProductTypeY2 implements ProductTypeY {
  @Override
  public void doSomethingY() {
    System.out.println("ConcreteProductTypeY2 doSomething");
  }
}

// public class ConcreteProductTypeY3 implements ProductTypeY {
//   @Override
//   public void doSomethingY() {
//     System.out.println("ConcreteProductTypeY3 doSomething");
//   }
// }

/**
 * Client
 *
 * If want to add a factory, need to:
 * stpe 1: add one ConcreateFactory class
 * step 2: add two ConcreteProduct class (one for each)
 *
 * If want to add a ProductType (equals add one factory method for
 * AbstractFactory), need to:
 * step 1: add one ProductType
 * step 1.2: each ProductType implements three ConcreteProduct
 * step 2: add one factory method to the AbstractFactory for new ProductType
 * stpe 3: add one ConcreateFactory class
 * stpe 3.2: each ConcreateFactory class override three factory methods
 *
 * (It is hard to add a ProductType or a factory method, because need to
 * modify AbstractFactory's code and ConcreteFactory's code.)
 */
public class Client {
  public static void main(String[] args) {
    private Factory factory;

    // Factory1
    factory = ConcreteFactory1();
    private ProductTypeX factory1ProductTypeX = factory.factoryMethodTypeX();
    private ProductTypeY factory1ProductTypeY = factory.factoryMethodTypeY();

    // Factory2
    factory = ConcreteFactory2();
    private ProductTypeX factory2ProductTypeX = factory.factoryMethodTypeX();
    private ProductTypeY factory2ProductTypeY = factory.factoryMethodTypeY();

    // // Factory3
    // factory = ConcreteFactory3();
    // ProductTypeX factory3ProductTypeX = factory.factoryMethodTypeX();
    // ProductTypeY factory3ProductTypeY = factory.factoryMethodTypeY();
  }
}
