package patterns.behavioral.strategy;

public class CaesarCypher implements EncriptionStrategy {

	public String encrypt(String inputData) {
		char[] chars = inputData.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (c == 'z') {
				c = 'a';
			}
			if ((c >= 'a') && (c < 'z')) {
				++c;
			}
			chars[i] = c;
		}
		return new String(new String(chars));
	}
}
