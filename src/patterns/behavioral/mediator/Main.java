package patterns.behavioral.mediator;

public class Main {
	public static void main(String[] args) {
		View view = new View();
		
		System.out.println("Search pushed:");
		view.search();
		System.out.println("\nDelete pushed:");
		view.delete();
		System.out.println("\nExit pushed:");
		view.exit();
	}
}
		