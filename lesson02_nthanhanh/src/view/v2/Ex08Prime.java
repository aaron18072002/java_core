package view.v2;

public class Ex08Prime {

	public static void main(String[] args) {
		
	}
	
	private static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		if(number == 2 && number == 3) {
			return true;
		}
		for(int i = 2; i <= number/2; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
