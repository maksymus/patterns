package patterns.structural.chain;

public class President extends PurchaseHandler {
	private static final int LIMIT = Integer.MAX_VALUE;
	
	@Override
	public boolean authorize(int amount) {
		if(amount < LIMIT) {
			System.out.println(President.class.getName() + " authorized");
			return true;
		} else{
			return getNext().authorize(amount);
		}
	}
}
