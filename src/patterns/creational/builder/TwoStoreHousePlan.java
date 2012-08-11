package patterns.creational.builder;

public class TwoStoreHousePlan implements HousePlan {

	public void buildFloor() {
		System.out.println("floor");
	}

	public void buildRoof() {
		System.out.println("roof");
	}

	public void buildTrunk() {
		System.out.println("1 store");
		System.out.println("2 store");
	}
}
