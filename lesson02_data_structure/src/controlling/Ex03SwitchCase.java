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
		int numberInt = rd.nextInt(1,6);
		System.out.println("Số --> " + numberInt);
		
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
			default:
				numberStr = "Five";
		}
		
		System.out.println("Tên tiếng anh --> " + numberStr);
	}
}
