package patterns.structural.facade;

public class Main {
	public static void main(String[] args) {
		CustomerFacade cf = new CustomerFacade();
		cf.createCustomer(10, "12345", 20);
	}
}
