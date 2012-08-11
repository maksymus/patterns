package patterns.structural.facade;

public class Card {
	private long number;
	
	public void setNumber(long number) {
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}
	
	public void save() {
		System.out.println("Saving card: " + number);
	}
}
