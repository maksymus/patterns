package patterns.structural.chain;

public class VicePresident extends PurchaseHandler {
	private static final int LIMIT = 500;
	
	@Override
	public boolean authorize(int amount) {
		if(amount < LIMIT) {
			System.out.println(VicePresident.class.getName() + " authorized");
			return true;
		} else{
			return getNext().authorize(amount);
		}
	}
}
