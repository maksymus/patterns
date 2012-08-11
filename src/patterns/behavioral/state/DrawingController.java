package patterns.behavioral.state;

public class DrawingController {
	private Tool tool;

	public void selectLineTool() {
		tool = new LineTool();
	}
	
	public void selectSquareTool() {
		tool = new SquareTool();
	}
	
	public void mouseMove() {
		tool.mouseMove();
	}

	public void mouseUp() {
		tool.mouseUp();
	}

	public void mouseDown() {
		tool.mouseDown();
	}
}
