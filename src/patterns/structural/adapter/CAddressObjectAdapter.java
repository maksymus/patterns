package patterns.structural.adapter;

public class CAddressObjectAdapter implements Validator {

	private CAddress caAddress = new CAddress();
	
	public boolean isValidAddress(String index) {
		return caAddress.isValidCanadianAddress(index);
	}

}
