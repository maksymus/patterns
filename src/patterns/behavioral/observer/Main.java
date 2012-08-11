package patterns.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		ReportManager rm = new ReportManager();
		rm.register(new MonthlyReport());
		rm.setDepartment("dept1");
		rm.setDepartment("dept2");
	}
}
