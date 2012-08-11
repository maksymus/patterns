package patterns.collectional.composite;

public interface FileSystemComponent {
	public FileSystemComponent[] getComponents();
	public FileSystemComponent getComponent(int location);
	public void addComponent(FileSystemComponent component);
	public int countComponents();
	public String getName();
}
