package patterns.creational.builder;

public class Builder {
	private HousePlan housePlan;
	
	public void setHousePlan(HousePlan housePlan) {
		this.housePlan = housePlan;
	}
	
	public void build() {
		housePlan.buildFloor();
		housePlan.buildTrunk();
		housePlan.buildRoof();
	}
}
