package view.test01;

public class Ex02SpecialNumber {
	
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(8));
	}
	
	private static boolean isSpecialNumber(int number) {
		if(number == 1) {
			return true;
		}
		
		int sum = 0;
		int count = 1;
		while(true) {
			if(count > number/2) {
				break;
			}
			if(number%count == 0) {				
				sum += count;
			}
			count++;
		}
		
		return sum == number;
	}
	
}
