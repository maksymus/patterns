package patterns.collectional.composite;



public class Dir implements FileSystemComponent {

	private FileSystemComponent[] components;
	private int count;
	private String name;
	
	public Dir(String name) {
		this.components = new FileSystemComponent[10];
		this.count = 0;
		this.name = name;
	}
	
	public void addComponent(FileSystemComponent component) {
		grow();
		components[count++] = component;
	}

	public int countComponents() {
		return count;
	}

	public FileSystemComponent getComponent(int location) {
		if(location >= components.length) {
			return null;
		}
		
		return components[location];
	}

	public FileSystemComponent[] getComponents() {
		FileSystemComponent[] res = new FileSystemComponent[count];
		
		for(int i = 0; i < count; i++) {
			res[i] = components[i];
		}
		
		return res;
	}
	
	private void grow() {
		if(count + 1 > components.length) {
			FileSystemComponent[] newComponents = new FileSystemComponent[(int) (components.length * 1.5)];
			copy(newComponents);
			components = newComponents;
		}
	}
	
	private void copy(FileSystemComponent[] newComponents) {
		for (int i = 0; i < components.length; i++) {
			newComponents[i] = components[i];
		}
	}

	public String getName() {
		return name;
	}
}
