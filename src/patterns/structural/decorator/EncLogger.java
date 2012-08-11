package patterns.structural.decorator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncLogger extends LoggerDecorator {

	public EncLogger(Logger loger) {
		super(loger);
	}
	
	@Override
	public void log(String message) {
		super.log(encryptMessage(message));
	}
	
	private String encryptMessage(String message) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(message.getBytes());
			byte messageDigest[] = md.digest();
            
			StringBuffer hexString = new StringBuffer();
			for (int i=0;i<messageDigest.length;i++) {
				hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
			}
			return messageDigest.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
}
