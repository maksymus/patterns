package patterns.structural.decorator;

public class HtmlLogger extends LoggerDecorator {

	public HtmlLogger(Logger loger) {
		super(loger);
	}

	@Override
	public void log(String message) {
		super.log(createHtml(message));
	}
	
	private String createHtml(String message) {
		return "<htm>" + message + "</html>";
	}
}
