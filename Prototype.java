/**
 * PrototypeMgr (Use Singleton Pattern)
 */
public class PrototypeMgr() {
  private static HashTable<String, Prototype> prototypes = new HashTable<String, Prototype>();

  private PrototypeMgr(){}

  public static Prototype getPrototype(String name) {
    Prototype originalPrototype = prototypes.get(name);
    return (Prototype) originalPrototype.clone();
  }

  public static init() {
    ConcretePrototype originalPrototype = new ConcretePrototype();
    originalPrototype.setName("originalPrototype");
    prototypes.put(originalPrototype.getName(), originalPrototype);

    System.out.println(originalPrototype.getName()); // originalPrototype
  }

}

/**
 * Prototype
 */
public class Prototype implements Cloneable {
  private String name;
  private String type;

  public abstract void doSomething();

  @Override
  public Object clone() {
    Object clone = null;

    try {
      clone = super.clone();
    } catch (CloneNotSupportedException) {
      e.printStackTrace();
    }

    return clone;
  }

  /* Getter and Setter */
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getType() {
    return type;
  }
}

/**
 * ConcretePrototype
 */
public class ConcretePrototype extends Prototype {
  public ConcretePrototype() {
    type = "ConcretePrototype";
  }

  @Override
  public void doSomething() {
    System.out.println("ConcretePrototype doSomething");
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    PrototypeMgr.init(); // init originalPrototype
    private Prototype cloned1 = PrototypeMgr.getPrototype("originalPrototype");
    private Prototype cloned2 = PrototypeMgr.getPrototype("originalPrototype");
    cloned1.setName("clonedPrototype1");
    cloned2.setName("clonedPrototype2");

    System.out.println(cloned1.getName()); // clonedPrototype1
    System.out.println(cloned2.getName()); // clonedPrototype2
  }
}
