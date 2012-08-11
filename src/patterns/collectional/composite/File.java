package patterns.collectional.composite;

public class File implements FileSystemComponent {

	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	public void addComponent(FileSystemComponent component) {
	}

	public FileSystemComponent getComponent(int location) {
		return null;
	}

	public FileSystemComponent[] getComponents() {
		return new FileSystemComponent[] {};
	}

	public int countComponents() {
		return 0;
	}

	public String getName() {
		return name;
	}
}
