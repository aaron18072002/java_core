package view;

import java.util.Arrays;
import java.util.Random;

public class Ex10Random {
	private static final Random rd = new Random();
	
	public static void main(String[] args) {
		/*
			Bài 10: Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → 
			[20, 30]
			Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
		*/
		int[] numbers = generateRandomNumber(5, 20, 26);
		
		System.out.println("numbers --> " + Arrays.toString(numbers));
	}
	
	private static int[] generateRandomNumber(int length, int minInclusive, int maxExclusive) {
		if(length < maxExclusive - minInclusive) {
			System.out.println(">>>>Yêu cầu không hợp lệ<<<<");
			return new int[] {};
		}
		
		int[] numbers = new int[length]; // {0,0,0,0,0}
		
		for(int i = 0; i < length;) {
			int newVal = rd.nextInt(minInclusive, maxExclusive);
			if(!isExist(numbers, i, newVal)) {
				numbers[i] = newVal;
				i++;
			}
		}
		
		return numbers;
	}
	
	private static boolean isExist(int[] numbers, int pos, int newVal) {
		for(int i = 0; i < pos; i++) {
			if(numbers[i] == newVal) {
				return true;
			}
		}
		return false;
	}
}
