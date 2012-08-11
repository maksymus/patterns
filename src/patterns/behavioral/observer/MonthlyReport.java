package patterns.behavioral.observer;

public class MonthlyReport implements Observer {
	public void update(Observable observable) {
		if(observable instanceof ReportManager) {
			ReportManager rm = (ReportManager) observable;
			System.out.println("New department: " + rm.getDepartment());
		}
	}
}
