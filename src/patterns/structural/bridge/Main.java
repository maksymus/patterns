package patterns.structural.bridge;

public class Main {
	public static void main(String[] args) {
		QtDrawApi qtDrawApi = new QtDrawApi();
		GtkDrawApi gtkDrawApi = new GtkDrawApi();
		
		Window qtWindow = new Window(qtDrawApi);
		Window gtkWindow = new Window(gtkDrawApi);
		
		qtWindow.draw();
		gtkWindow.draw();
	}
}
