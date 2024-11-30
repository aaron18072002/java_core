package view;

import java.util.Scanner;

public class Ex02Power {
	public static void main(String[] args) {
		/*
			Bài 2: Viết chương trình (hàm) kiểm tra số nguyên N có phải là 
			lũy thừa của 2 hay không Biết rằng N là số nguyên dương được 
			nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần) 
			hoặc khai báo biến có sẵn giá trị hợp lệ
			VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
			= 4 → true
			= 6 → false
			= 8 true
			= 9 → false
		*/
		Scanner ip = new Scanner(System.in);
		String text = null;
		int number = 0;
		int wrongTimes = 0;
		while(true) {
			System.out.print("Nhập số nguyên dương n: ");
			text = ip.nextLine();
			if(isPositiveNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
			wrongTimes++;
			System.out.println("Bạn đã nhập sai " + wrongTimes + " lần");
			if(wrongTimes == 5) {
				System.out.println("Bạn đã hết số lần nhập");
				ip.close();
				return;
			}
		}
		
		if(isPowerOfTwo(number)) {
			System.out.println(number + " là lũy thừa của 2");
		}
		System.out.println(number + " không phải là lũy thừa của 2");
		
		ip.close();
	}
	
	private static boolean isPowerOfTwo(int number) {
		if(number <= 1) {
			return false;
		}
		double n = Math.log(number) / Math.log(2); 
		// logcnumber/logc2 = log2number = n --> 2^n = number
		
		System.out.println("Số mũ: " + n);
		
		return Math.floor(n) == Math.ceil(n) ? true : false;
	}
	
	private static boolean isPositiveNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter <= '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
