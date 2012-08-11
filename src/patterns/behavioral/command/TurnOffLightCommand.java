package patterns.behavioral.command;

public class TurnOffLightCommand implements Command {

	private Light light;
	
	public TurnOffLightCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.turnOff();
	}
}
