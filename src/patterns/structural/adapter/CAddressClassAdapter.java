package patterns.structural.adapter;

public class CAddressClassAdapter extends CAddress implements Validator {

	public boolean isValidAddress(String index) {
		return isValidCanadianAddress(index);
	}
}
