package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ReportManager implements Observable {

	private String department;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public void register(Observer observer) {
		observers.add(observer);
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
		notifyObservers();
	}
}
