package view.localdatetime;

import java.time.LocalDate;
import java.time.Month;

public class Ex01LocalDate {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("date1: " + date1);
		
		LocalDate date2 = LocalDate.of(2024, Month.OCTOBER, 28);
		System.out.println("date2: " + date2);
		
		LocalDate date3 = LocalDate.now();
		System.out.println("date --> " + System.identityHashCode(date3));
		
		date3 = date3.withYear(2016)
					 .withDayOfMonth(18)
					 .withMonth(2)
					 .plusDays(13);
		
		System.out.println("date --> " + 
				System.identityHashCode(date3));
	}
	
}
