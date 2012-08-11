package patterns.behavioral.mediator;

public abstract class Component {
	protected Mediator mediator;
	private boolean enabled = true;
	private String id;
	
	public Component(String id, Mediator mediator) {
		this.id = id;
		this.mediator = mediator;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void printComponentState() {
		System.out.println("\t\t" + id + ": " + (enabled ? "enabled": "disabled"));
	}
	
	public abstract void action();
}
