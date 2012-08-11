package patterns.structural.bridge;

public class GtkDrawApi implements DrawApi {

	public void drawWindow() {
		System.out.println("GTK drawing");
	}
}
