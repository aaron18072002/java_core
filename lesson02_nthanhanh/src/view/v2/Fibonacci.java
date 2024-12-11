package view.v2;

import java.util.Scanner;

public class Fibonacci {

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
		System.out.println("Số fibonacci thứ " + 4 + " là: " + 
				findFibonacciAtN(4));
		System.out.println("Số đảo ngược của " + n + 
				" là: " + symetricOfN(n));
		ip.close();
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
	
	private static long symetricOfN(int n) {
		long s = 0;
		while(true) {
			if(n == 0) {
				break;
			}
			int mod = n%10;
			s = s*10 + mod;
			n /= 10;
		}
		return s;
	}
	
	private static long findFibonacciAtN(int n) {
		long first = 0;
		long second = 1;
		long temp = 0;
		int count = 2;
		while(true) {
			if(count == n) {
				break;
			}
			count++;
			temp = first + second;
			first = second;
			second = temp;
		}
		return temp;
	}
	
}
