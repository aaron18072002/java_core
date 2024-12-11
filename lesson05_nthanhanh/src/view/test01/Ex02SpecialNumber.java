package view.test01;

public class Ex02SpecialNumber {
	
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(1));
		System.out.println(isSpecialNumber(3));
		System.out.println(isSpecialNumber(6));
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(8));
	}
	
	public static boolean isSpecialNumberV2(int S) {
		int sum =0;
		int n = 1;
		while(sum<S) {
			sum +=n;
			n++;
		}
		return S==sum;
	}
	
	private static boolean isSpecialNumber(int number) {
		if(number == 1) {
			return true;
		}
		int count = 1;
		int sum = 0;
		while(true) {
			if(sum >= number) {
				break;
			}
			sum += count;
			count++;
		}
		return sum == number;
	}
	
}
