package patterns.creational.factory;

public class FileLogger implements Logger {

	public void log(String message) {
		System.out.println("Writing to FILE");
	}
}
