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
}
