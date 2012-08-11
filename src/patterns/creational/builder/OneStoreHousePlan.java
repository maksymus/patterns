package patterns.creational.builder;

public class OneStoreHousePlan implements HousePlan {

	public void buildFloor() {
		System.out.println("floor");
	}

	public void buildRoof() {
		System.out.println("roof");
	}

	public void buildTrunk() {
		System.out.println("store");
	}
}
