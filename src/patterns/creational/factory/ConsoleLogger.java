package patterns.creational.factory;

public class ConsoleLogger implements Logger {

	public void log(String message) {
		System.out.println("Writing to CONSOLE");
	}
}
