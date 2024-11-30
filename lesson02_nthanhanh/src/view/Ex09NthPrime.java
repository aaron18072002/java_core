package view;

import utils.NumberUtils;

public class Ex09NthPrime {
	public static void main(String[] args) {
		/*
			Bài 9: Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống 
			số tự nhiên.
		*/
		int nthNumber = 200;
		int runningNumber = 2;
		int count = 0;
		while(true) {
			if(NumberUtils.isPrime(runningNumber)) {
				count++;
				if(count == nthNumber) {
					break;
				}
			}
			runningNumber++;
		}
		
		System.out.println("Số nguyên tố thứ " + count + " --> " + runningNumber);
	}
}
