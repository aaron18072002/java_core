package utils;

public class NumberUtils {
	public static long fact(int n) {
		long f = n;
		while(n > 1) {
			n--;
			f = f * n;
		}
		return f;
	}
	
	public static boolean isPositiveNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter <= '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
