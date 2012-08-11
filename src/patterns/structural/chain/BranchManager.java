package patterns.structural.chain;

public class BranchManager extends PurchaseHandler {

	private static final int LIMIT = 100;
	
	@Override
	public boolean authorize(int amount) {
		if(amount < LIMIT) {
			System.out.println(BranchManager.class.getName() + " authorized");
			return true;
		} else{
			return getNext().authorize(amount);
		}
	}

}
