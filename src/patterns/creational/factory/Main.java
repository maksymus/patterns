package patterns.creational.factory;

import patterns.creational.factory.LoggerFactory.LoggerType;

public class Main {
	public static void main(String[] args) {
		LoggerFactory loggerFactory = new LoggerFactory();
		Logger logger = loggerFactory.getLogger(LoggerType.FILE);
		logger.log("message");
	}
}
