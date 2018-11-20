/**
 * Originator
 */
public class Originator {
	private String state;

	public Memento saveToMemento() {
		return new Memento(state);
	}

	public void restoreFromMemento(Memento memento) {
		state = memento.getState();
	}

	/* Getter and Setter */
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

/**
 * Memento
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}

/**
 * Caretaker
 */
public class Caretaker {
	private ArrayList<Memento> mementos = new ArrayList<Memento>();

	public void addMemento(Memento memento) {
		mementos.add(memento);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}

/**
 * Client
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.set("State1");
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State2");

		originator.restoreFromMemento(caretaker.getMemento(0));
	}
}

