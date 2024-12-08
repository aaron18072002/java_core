package view;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01AgeYearException {

	public static void main(String[] args) {
		
		// BT1: Nhập năm sinh, in ra tuổi
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập năm sinh: ");
		int yob = Integer.parseInt(ip.nextLine()); //Dòng bị exception
																					
		int currentYear = LocalDate.now().getYear();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi --> " + age);
		
		ip.close();
	}
	
}
