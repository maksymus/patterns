package patterns.structural.decorator;

public class Main {
	public static void main(String[] args) {
		ConsoleLogger logger = new ConsoleLogger();
		
		new HtmlLogger(new EncLogger(logger)).log("This is my message");
	}
}
