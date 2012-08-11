package patterns.structural.proxy;

public class VirtualProxy {
	private Resource resource;
	
	public void doSomething() {
		if(resource == null) {
			resource = new Resource();
		}
		
		resource.doSomething();
	}
}
