package view.test01;

import java.util.Scanner;

public class Ex01MinFract {

	/*
	 * Bài 1 (20đ):Viết chương trình nhập vào 1 số thực có phần thập phân khác 0.
	 * Yêu cầu nhập lại(tối đa 3 lần) nếu nhập sai Sau đó tìm phân số tối giản của
	 * số thập phân đó. Ví dụ ▪ 0.1 → 1/10 ▪ 0.2 → 1/5 ▪ 0.04 → 1/25 ▪ 0.75 → 3/4 ▪
	 * 1.5 → 3/2
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = null;
		Double number = null;
		int count = 0;

		while (count != 0) {
			System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
			text = sc.nextLine();
			number = Double.parseDouble(text);
			if (number % 1 != 0) {
				break;
			}

			count++;
			System.out.printf("Nhập sai %d lần\n", count);
			if (count == 3) {
				number = null;
				sc.close();
				break;
			}
		}
		
//		if (number != null) {
//			System.out.printf("Phân số tối giản của %f là %s", number, getMinFract(number));
//		}
		
		double[] decimals = {0.15d,0.35d};
		long startTime = System.currentTimeMillis();
		for(double decimal:decimals) {		
			System.out.printf("Phân số tối giản của %f là %s\n",
					decimal,getMinFract(decimal));
		}
		System.out.println("Duration --> " + 
				(System.currentTimeMillis() - startTime));
	}
	
	// greatest common divisor
	// UCLN
	private static long gcd(long n1,long n2) {
		while(n1 != n2) {
			if(n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		return n1;
	}

	private static String getMinFract(double number) {
		double numerator = number;
		double denominator = 1;
		while (!isInteger(numerator)) {
			numerator *= 10;
			denominator *= 10;
		}
//		long divisor = gcd((long)number,(long)denominator);
		long divisor = gcd((long)numerator,(long)denominator);
		return (long)numerator/divisor + "/" + (long)denominator/divisor;
	}

	private static boolean isInteger(double number) {
		if (Math.ceil(number) == Math.floor(number)) {
			return true;
		}
		return false;
	}
	

//	private static boolean isNumber(String text) {
//		if (text == null) {
//			return false;
//		}
//		for (int i = 0; i < text.length(); i++) {
//			if (text.charAt(i) <= '0' || text.charAt(i) > '9') {
//				return false;
//			}
//		}
//		return true;
//	}

}
