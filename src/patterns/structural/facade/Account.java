package patterns.structural.facade;

public class Account {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void save() {
		System.out.println("Saving account: " + id);
	}
}
