package view;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex3TryCatch {
	
	/*
		Cách 1: Sử dụng try/catch để bắt lỗi
		
		+ Với đoạn code bị exception
		
		+ Khi ko xử lý lỗi --> gặp dòng lỗi --> dừng chươn trình
		
		+ Khi xử lý lỗi với trycatch
			. Đặt đoạn code có khả năng bị exception trong khối try
			. Đặt code xử lý trong khối catch
			. Lưu ý: chỉ xử lý khi bắt đúng exception
	*/

	public static void main(String[] args) {
		
		// BT1: Nhập năm sinh, in ra tuổi
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập năm sinh: ");
		int yob = 0;
		do {	
			try {
				yob = Integer.parseInt(ip.nextLine()); //Dòng bị exception
				break;
			} catch(NumberFormatException e) {
				System.out.print("Năm sinh ko hợp lệ, nhập lại: ");
			}
		} while(true);
		
																					
		int currentYear = LocalDate.now().getYear();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi --> " + age);
		
		ip.close();
	}
	
}
