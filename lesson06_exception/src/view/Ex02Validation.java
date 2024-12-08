package view;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex02Validation {
	
	/*
		Cách 1: Sử dụng validation
		--> đảm bảo đoạn code bị exception sẽ ko bao h xảy ra
	 */

	public static void main(String[] args) {
		
		// BT1: Nhập năm sinh, in ra tuổi
		
		Scanner ip = new Scanner(System.in);
		String text = null;
		
		do {
			System.out.print("Nhập năm sinh: ");
			text = ip.nextLine();
			
			if(text.matches("\\d+")) {
				break;
			}
			
			System.out.println("Năm sinh chưa hợp lệ");
		} while(true);
		
		int yob = Integer.parseInt(text); //Dòng bị exception
																					
		int currentYear = LocalDate.now().getYear();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi --> " + age);
		
		ip.close();
	}
	
}
