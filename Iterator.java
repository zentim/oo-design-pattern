/**
 * Iterator
 */
public interface Iterator {
  boolean hasNext();
  Object next();
}

/**
 * ConcreteIterator
 */
public class ConcreteIterator implements Iterator {
  private ConcreteAggregate ca;
  private int index = 0;

  public ConcreteIterator(ConcreteAggregate ca) {
    this.ca = ca;
  }

  @Override
  public boolean hasNext() {
    return index < ca.getLength();
  }

  @Override
  public Object next() {
    Item item = ca.getItemAt(index);
    index++;
    return item;
  }
}

/**
 * Aggregate
 */
public interface Aggregate {
  Iterator iterator();
}

/**
 * ConcreteAggregate
 */
public class ConcreteAggregate implements Aggregate {
  private Item[] items;
  private int index = 0;

  public ConcreteAggregate() {
    this.items = new Item[10];
  }

  @Override
  public Iterator iterator() {
    return new ConcreteIterator(this);
  }

  public Item getItemAt(int index) {
    return items[index];
  }

  public void addItem(Item item) {
    items[index] = item;
    index++;
  }

  public int getLength() {
    return index;
  }
}

/**
 * POJO
 */
public class Item {
  private String name;

  public Item(String name) {
    this.name = name;
  }

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
    private ConcreteAggregate ca = new ConcreteAggregate();
    ca.addItem(new Item("item1"));
    ca.addItem(new Item("item2"));
    ca.addItem(new Item("item3"));

    ConcreteIterator ci = ca.iterator();
    while(ci.hasNext()) {
      Item item = (Item) ci.next();
      System.out.println(item.getName());
    }
  }
}
