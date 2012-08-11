package patterns.behavioral.state;

public class Main {
	public static void main(String[] args) {
		DrawingController dc = new DrawingController();
		dc.selectLineTool();
		dc.mouseUp();
		
		dc.selectSquareTool();
		dc.mouseUp();
	}
}
