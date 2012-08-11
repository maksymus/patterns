package patterns.behavioral.command;

public class Main {
	public static void main(String[] args) {
		Light bubble = new Light();
		
		Switch s = new Switch(new TurnOnLightCommand(bubble), new TurnOffLightCommand(bubble));
		
		for (int i = 0; i < 10; i++) {
			s.flip();
		}
	}
}
