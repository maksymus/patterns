package patterns.creational.factory;

public class LoggerFactory {
	public enum LoggerType {
		FILE,
		CONSOLE
	}
	
	public Logger getLogger(LoggerType loggerType) {
		if(loggerType == LoggerType.FILE) {
			return new FileLogger();
		} else if(loggerType == LoggerType.CONSOLE) {
			return new ConsoleLogger();
		}
		
		return null;
	}
}
