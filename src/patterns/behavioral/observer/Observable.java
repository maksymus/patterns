package patterns.behavioral.observer;

public interface Observable {
	void register(Observer observer);
	void notifyObservers();
}
