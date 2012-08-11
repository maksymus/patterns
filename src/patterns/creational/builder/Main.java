package patterns.creational.builder;

public class Main {
	public static void main(String[] args) {
		Builder builder = new Builder();
		
		builder.setHousePlan(new OneStoreHousePlan());
		builder.build();
		
		builder.setHousePlan(new TwoStoreHousePlan());
		builder.build();
	}
}
