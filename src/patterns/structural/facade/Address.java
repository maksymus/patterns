package patterns.structural.facade;

public class Address {
	private String zip;

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void save() {
		System.out.println("Saving address: " + zip);
	}
}
