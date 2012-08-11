package patterns.behavioral.strategy;

public class Main {
	public static void main(String[] args) {
		EncriptionStrategy strategy = new SimpleEncryption();
		
		System.out.println(strategy.encrypt("This is some text"));
		
		strategy = new CaesarCypher();
		
		System.out.println(strategy.encrypt("This is some text"));
	}
}
