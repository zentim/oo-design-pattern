/**
 * Builder
 */
public interface Builder {
  void doX();
  void doY();
  void doZ();
  Result getResult();
}

/**
 * ConcreteBuilder
 */
public class ConcreteBuilder implements Builder {
  private Result result = new Result();

  public void doX() {
    result.setPart(new Part);
  }

  public void doY() {
    result.setPart(new Part);
  }

  public void doZ() {
    result.setPart(new Part);
  }

  public Result getResult() {
    return result;
  }
}

/**
 * Director
 */
public interface Director() {
  Result construct();
}

/**
 * ConcreteDirector
 */
public class ConcreteDirector implements Director() {
  private Builder builder;

  public ConcreteDirector(Builder builder) {
    this.builder = builder;
  }

  public Result construct() {
    builder.doX();
    builder.doY();
    builder.doZ();

    return builder.getResult();
  }
}


/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();
    Director director = new ConcreteDirector(builder);
    Result result = director.construct();
  }
}
