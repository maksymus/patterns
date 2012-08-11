package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

import patterns.behavioral.memento.Originator.Memento;

public class CareTaker {
	private List<Memento> states = new ArrayList<Memento>();
	
	public void addState(Memento memento) {
		states.add(memento);
	}
	
	public Memento getPreviousState() {
		Memento memento = states.get(states.size() - 1);
		states.remove(states.size() - 1);
		return memento;
	}
}
