package patterns.collectional.composite;

public class Main {

	public static void main(String[] args) {
		FileSystemComponent root = new Dir("/");
		FileSystemComponent usr = new Dir("/usr");
		FileSystemComponent var = new Dir("/var");
		FileSystemComponent file = new File("file.txt");
		
		root.addComponent(usr);
		root.addComponent(var);
		root.addComponent(file);
		
		FileSystemComponent lib = new Dir("/lib");
		FileSystemComponent include = new Dir("/include");
		FileSystemComponent file2 = new File("file2.avi");
		
		usr.addComponent(include);
		usr.addComponent(lib);
		usr.addComponent(file2);
		
		print(root, "");
	}
	
	public static void print(FileSystemComponent component, String sep) {
		System.out.println(sep + component.getName());
		for (FileSystemComponent child: component.getComponents()) {
			print(child, sep + "\t");
		}
	}
}
