package view.v2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = null;
		int n;
		while(true) {		
			System.out.print("Nhâp 1 số n: ");
			text = ip.nextLine();
			if(isNumber(text)) {	
				n = Integer.parseInt(text);
				break;
			}
			System.out.println("Nhập lại");		
		}
		
		System.out.println("Số đảo ngược của " + n + 
				" --> " + reverseOfN(n));
		
		ip.close();
	}
	
	private static int reverseOfN(int n) {
		int r = 0;
		while(true) {
			if(n == 0) {
				break;
			}
			int mode = n%10;
			r = r*10 + mode;
			n /= 10;
		}
		return r;
	}
	
	private static boolean isNumber(String text) {
		if(text == null || text.isEmpty()) {
			return false;
		}
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter <= '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
	
}
