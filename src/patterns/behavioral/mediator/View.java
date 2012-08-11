package patterns.behavioral.mediator;

public class View {
	private Component searchButton;
	private Component deleteButton;
	private Component exitButton;
	
	public View() {
		Mediator med = new Mediator();
		
		searchButton = new Component("searchButton", med) {
			@Override
			public void action() {
				mediator.search();
			}
		};

		deleteButton = new Component("deleteButton", med) {
			@Override
			public void action() {
				mediator.delete();
			}
		};

		exitButton = new Component("exitButton", med) {
			@Override
			public void action() {
				mediator.exit();
			}
		};

		med.registerSearchButton(searchButton);
		med.registerDeleteButton(deleteButton);
		med.registerExitButton(exitButton);
	}
	
	public void search() {
		searchButton.action();
	}
	
	public void delete() {
		deleteButton.action();
	}

	public void exit() {
		exitButton.action();
	}
}
