package patterns.behavioral.state;

public class SquareTool implements Tool {

	public void mouseDown() {
	}

	public void mouseMove() {
	}

	public void mouseUp() {
		System.out.println("__");
		System.out.println("| |");
		System.out.println("---");
	}
}
