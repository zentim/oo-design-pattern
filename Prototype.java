/**
 * Prototype
 */
public class Item implements Cloneable {
  private String name;

  public Item(String name) {
    this.name = name;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return new Item(name);
  }

  /* Getter and Setter */
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    private Item original = new Item("Item1");
    private Item clone = original.clone();
    clone.setName("Item2");

    System.out.println(original.getName()); // Item1
    System.out.println(clone.getName()); // Item2
  }
}
