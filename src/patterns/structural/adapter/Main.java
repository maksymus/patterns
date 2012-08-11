package patterns.structural.adapter;

public class Main {
	public static void main(String[] args) {
		USAddress usAddress = new USAddress();
		System.out.println(usAddress.isValidAddress("12"));
		
		CAddressClassAdapter classAdapter = new CAddressClassAdapter();
		System.out.println(classAdapter.isValidAddress("1234"));
		
		CAddressObjectAdapter objectAdapter = new CAddressObjectAdapter();
		System.out.println(objectAdapter.isValidAddress("123"));
	}
}
