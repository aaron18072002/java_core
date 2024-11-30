package view;

import java.util.Scanner;

import utils.NumberUtils;

public class Ex05Symetric {
	public static void main(String[] args) {
		/*
			Bài 5: Viết chương trình kiểm tra N có phải là số đối xứng 
			hay không I Biết rằng N được nhập từ bàn phím là một số nguyên dương 
			có tối thiểu 2 chữ số
			VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại = a123 = 1 = 256 = 12521 
			= 2662 báo lỗi, yêu cầu nhập lại báo lỗi, 
			yêu cầu nhập lại false true true
		*/
		Scanner ip = new Scanner(System.in);
		String text = null;
		int number = 0;
		int wrongTimes = 0;
		while(true) {
			System.out.print("Nhập số có 2 chữ số n: ");
			text = ip.nextLine();
			if(NumberUtils.isPositiveNumber(text) && hasTwoNumber(text)) {
				number = Integer.parseInt(text);
				break;
			}
			wrongTimes++;
			if(wrongTimes == 1) {
				System.out.println("Bạn đã hết số lần nhập");
				ip.close();
				return;
			}
		}
		
		if(isSymetricNumber(number)) {
			System.out.println(number + " là số đối xứng");
		} else {
			System.out.println(number + " không phải là số đối xứng");
		}
	} 
	
	private static boolean isSymetricNumber(int number) {
		int temp = number;
		int reversedNumber = 0;
		while(number != 0) {
			int modul = number % 10;
			reversedNumber = reversedNumber*10 + modul;
			number /= 10;
		}
		return reversedNumber == temp ? true : false;
	}
	
	private static boolean hasTwoNumber(String text) {
		return text.length() == 2 ? true : false;
	}
}
