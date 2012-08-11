package patterns.behavioral.command;

public class Switch {
	private Command turnOnCommand;
	private Command turnOffCommand;
	private boolean stateOn = false;
	
	public Switch(Command turnOnCommand, Command turnOffCommand) {
		this.turnOnCommand = turnOnCommand;
		this.turnOffCommand = turnOffCommand;
	}
	
	public void flip() {
		if(stateOn) {
			turnOffCommand.execute();
		} else {
			turnOnCommand.execute();
		}
		
		stateOn = !stateOn;
	}
}
