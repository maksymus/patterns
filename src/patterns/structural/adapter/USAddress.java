package patterns.structural.adapter;

public class USAddress implements Validator {

	public boolean isValidAddress(String index) {
		return index.length() == 5;
	}

}
