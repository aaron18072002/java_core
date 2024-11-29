package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		/*
			Sử dụng switch case để làm gọn code khi biểu thức if else so sánh =
			Câu 1: Random số ngẫu nhiều từ 1 đến 5
			--> In ra từ tiếng anh tương ứng với số đó
		*/
		Random rd = new Random();
		int numberInt = rd.nextInt(1,10);
		System.out.println("Số --> " + numberInt);
		
		/*
		  Dừng lại khi:
		  + gặp break
		  + xong hết default
		*/
		String numberStr; 
		switch(numberInt) {
			case 1:
				numberStr = "One";
				break;
			case 2:
				numberStr = "Two";
				break;
			case 3:
				numberStr = "Three";
				break;
			case 4:
				numberStr = "Four";
				break;
			case 5:
				numberStr = "Five";
				break;
			default: //else
				numberStr = "Unsupported ...";
		}
		
		System.out.println("Tên tiếng anh --> " + numberStr);
		
		System.out.println("\n========================\n");
		
		int number = rd.nextInt(2,10);
		switch (number) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Week day");
				break;
			case 7:
			case 8:
				System.out.println("Weekend day");
				break;
			default:
				System.out.println("Invalid day");
		}			
	}
}
