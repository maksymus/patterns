package patterns.structural.chain;

public class Main {
	public static void main(String[] args) {
		BranchManager bm = new BranchManager();
		VicePresident vp = new VicePresident();
		President p = new President();
		
		bm.setNext(vp);
		vp.setNext(p);
		
		bm.authorize(50);
		bm.authorize(150);
		bm.authorize(500);
	}
}
