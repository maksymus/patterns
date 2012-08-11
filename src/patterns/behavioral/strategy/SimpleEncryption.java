package patterns.behavioral.strategy;

public class SimpleEncryption implements EncriptionStrategy {

	public String encrypt(String data) {
		data = data.substring(data.length() - 1) + data.substring(0, data.length() - 1);
		return data;
	}
}
