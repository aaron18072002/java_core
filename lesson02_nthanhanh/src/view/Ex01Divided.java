package view;

import java.util.Scanner;

public class Ex01Divided {
	public static void main(String[] args) {
		/*
			Bài 1: Viết chương trình (hàm) kiểm tra số nguyên N có phải 
			là bội của 2 hay không
			Yêu cầu: N là số nguyên dương được nhập từ bàn phím, 
			bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
		*/

		Scanner ip = new Scanner(System.in);
		int number = inputNumber(0,5,"Nhâp n: ",ip);
		if(number%2 == 0) {		
			System.out.println(number + " là bội của 2");
		}
		
		closeScanner(ip);
	}
	
	public static int inputNumber(int minValue, int maxWrongTimes, String message, Scanner ip) {
		String text = null;
		int count = 0;
		while(true) {
			System.out.print(message);
			text = ip.nextLine();
			if(isPositiveNumber(text)) {
				break;
			}
			count++;
			System.out.println("Không hợp lệ, sai " + count + " lần");
			if(count == maxWrongTimes) {
				System.out.println("Bạn chỉ được phép nhập " + maxWrongTimes + " lần");
				closeScanner(ip);
				return -1;
			}
		}			
		closeScanner(ip);
		
		return Integer.parseInt(text);
	}
	
	public static boolean isPositiveNumber(String text) {
		if(text == null || text.isEmpty()) {
			return false;
		}
		for(int i = 0; i <= text.length() - 1; i++) {
			char letter = text.charAt(i);
			if(letter <= '0' || letter > '9' ) {
				return false;
			}
		}
		return true;
	}
	
	public static void closeScanner(Scanner scanner) {
		if(scanner != null) {
			scanner.close();
		}
	}
}
