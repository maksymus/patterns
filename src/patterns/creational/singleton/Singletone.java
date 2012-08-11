package patterns.creational.singleton;

public class Singletone {
	private static Singletone singletone;
	
	public static synchronized Singletone getInstance() {
		if(singletone != null) {
			singletone = new Singletone();
		}
		
		return singletone;
	}
	
	private Singletone() {}
}
