package view.v2;

public class Ex03Factorial {
	
	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
		System.out.println("8 --> " + convertToBinary(8));
	}
	
	private static long factorial(int number) {
		long f = number;
		while(number > 1) {
			number--;
			f *= number;
		}
		return f;
	}
	
	private static String convertToBinary(int decimal) {
		String strAsBinary = "";
		while(decimal != 0) {
			int mod = decimal%2;
			strAsBinary = mod + strAsBinary;
			decimal /= 2;
		}
		return strAsBinary;
	}
	
	private static boolean isPowerOfTwo(int number) {
		if(number <= 1) {
			return false;
		}
		while(true) {
			if(number%2 != 0) {
				return false;
			}
			number /= 2;
			if(number == 1) {
				break;
			}
		}
		return true;
	}
	
}
