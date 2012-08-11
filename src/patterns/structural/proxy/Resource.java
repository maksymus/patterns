package patterns.structural.proxy;

public class Resource {
	public Resource() {
		System.out.println("Creating resource");
	}
	
	public void doSomething() {
		System.out.println("Resource.doSomething()");
	}
}
