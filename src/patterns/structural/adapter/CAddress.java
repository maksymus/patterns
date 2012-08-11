package patterns.structural.adapter;

public class CAddress {
	public boolean isValidCanadianAddress(String index) {
		return index.length() == 4;
	}
}
