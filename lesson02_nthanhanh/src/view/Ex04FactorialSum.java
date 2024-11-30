package view;

import java.util.Arrays;
import java.util.Random;

import static utils.NumberUtils.*;

public class Ex04FactorialSum {
	public static void main(String[] args) {
		/*
			Bài 4: Viết chương trình tính tổng giải thừa của 
			các số nguyên dương S = a! +b! + c + d! Biết rằng a,b,c,d 
			là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
		*/
		int[] numbers = generateRandomNumber(4,10,20);
		
		System.out.println("Mảng số ngẫu nhiên[10,20) --> "
				+ Arrays.toString(numbers));
		
		System.out.println("Tổng giai thừa = " + sumOfFactorials(numbers));
	}
	
	private static long sumOfFactorials(int[] numbers) {
		long sum = 0;
		for(int number:numbers) {
			sum = sum + fact(number);
		}
		return sum;
	}
	
	private static int[] generateRandomNumber
		(int length, int minInclusive, int maxExclusive) {
		int[] numbers = new int[length];
		Random rd = new Random();
		
		for(int i = 0; i < length; i++) {
			numbers[i] = rd.nextInt(minInclusive, maxExclusive);
		}
		
		return numbers;
	}
}
