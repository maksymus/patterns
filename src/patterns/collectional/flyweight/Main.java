package patterns.collectional.flyweight;

public class Main {
	public static void main(String[] args) {
		Time t1 = TimeFactory.create(10, 30);
		Time t2 = TimeFactory.create(10, 30);
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
