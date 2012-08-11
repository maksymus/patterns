package patterns.structural.decorator;

public class LoggerDecorator implements Logger {

	private Logger logger;
	
	public LoggerDecorator(Logger loger) {
		this.logger = loger;
	}
	
	public void log(String message) {
		logger.log(message);
	}
}
