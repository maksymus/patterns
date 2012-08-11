package patterns.structural.chain;

public abstract class PurchaseHandler {
	private PurchaseHandler next;

	public abstract boolean authorize(int amount);
	
	public PurchaseHandler getNext() {
		return next;
	}

	public void setNext(PurchaseHandler next) {
		this.next = next;
	}
}
