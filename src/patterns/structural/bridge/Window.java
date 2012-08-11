package patterns.structural.bridge;

public class Window {
	private DrawApi drawApi;
	
	public Window(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	
	public void draw() {
		drawApi.drawWindow();
	}
}
