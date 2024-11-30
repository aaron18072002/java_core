package utils;

import java.util.Random;
import java.util.Scanner;

public class NumberUtils {
	private final static Scanner ip = new Scanner(System.in);
	
	public static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		
		if(number > 3) {
			return true;
		}
		
		for(int i = 2; i <= number/2; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] generateRandomNumber (int length, int minInclusive, int maxExclusive) {
		int[] numbers = new int[length];
		Random rd = new Random();
		
		for(int i = 0; i < length; i++) {
			numbers[i] = rd.nextInt(minInclusive, maxExclusive);
		}
		
		return numbers;
	}
	
	public static long fact(int n) {
		long f = n;
		while(n > 1) {
			n--;
			f = f * n;
		}
		return f;
	}
	
	public static int inputNumber(int minInclusive, 
			int maxExclusive, int maxWrongTimes, String message) {
		String text = null;
		int number = 0;
		int wrongTimes = 0;
		while(true) {
			System.out.print(message);
			text = ip.nextLine();
			if(isNumber(text, minInclusive, maxExclusive)) {
				number = Integer.parseInt(text);
				break;
			}
			wrongTimes++;
			System.out.println("Bạn đã nhập sai " + wrongTimes + " lần");
			if(wrongTimes == maxWrongTimes) {
				System.out.println("Bạn đã hết số lần nhập");
				return -1;
			}
		}
		return number;
	}
	
	public static boolean isNumber(String text, int minValue,int maxValue) {
		return isNumber(text) 
				&& Integer.parseInt(text) >= minValue 
					&& Integer.parseInt(text) < maxValue ;
	}
	
	public static boolean isNumber(String text, int minValue) {
		return isNumber(text) && Integer.parseInt(text) >= minValue;
	}
	
	public static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPositiveNumber(String text) {
		return isNumber(text) && Integer.parseInt(text) > 0;
	}
	
	public static void closeScanner() {
		ip.close();
	}
}
