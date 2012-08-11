package patterns.structural.proxy;

public class Main {
	public static void main(String[] args) {
		VirtualProxy vp = new VirtualProxy();
		vp.doSomething();
		vp.doSomething();
	}
}
