import java.util.Base64;

public class base64 {
	public static String encoding(String text) {
		return new String(Base64.getEncoder().encode(text.getBytes()));
	}
	
	public static String decoding(String text) {
		return new String(Base64.getDecoder().decode(text.getBytes()));
	}
}
