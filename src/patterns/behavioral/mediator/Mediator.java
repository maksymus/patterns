package patterns.behavioral.mediator;


public class Mediator {
	private Component searchButton;
	private Component deleteButton;
	private Component exitButton;
	
	public void registerSearchButton(Component button) {
		this.searchButton = button;
	}
	
	public void registerDeleteButton(Component button) {
		this.deleteButton = button;
	}

	public void registerExitButton(Component button) {
		this.exitButton = button;
	}
	
	public void search() {
		deleteButton.setEnabled(false);
		exitButton.setEnabled(false);
		printComponentsState();
	}
	
	public void delete() {
		searchButton.setEnabled(true);
		exitButton.setEnabled(true);
		printComponentsState();
	}
	
	public void exit() {
		deleteButton.setEnabled(false);
		searchButton.setEnabled(true);
		printComponentsState();
	}
	
	private void printComponentsState() {
		searchButton.printComponentState();
		deleteButton.printComponentState();
		exitButton.printComponentState();
	}
}
