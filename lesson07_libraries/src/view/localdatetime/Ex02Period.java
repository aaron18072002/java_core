package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02Period {

	// Sử dụng Period để tìm khoảng thời gian
	// giữa 2 mốc LocalDate
	
	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(2002, 7, 18);
		LocalDate now = LocalDate.now();
		
		if(dateOfBirth.isAfter(now)) {
			throw new IllegalArgumentException("StartDate must less than EndDate");
		}
		
		Period period = Period.between(dateOfBirth, now);
		System.out.println("khoảng thời gian: " + period);
		
		String dtDetails = optional(period.getYears(), "năm")
				+ optional(period.getMonths(), "tháng")
				+ optionalEnd(period.getDays(), "ngày");
		System.out.println("Khoảng thời gian: " + dtDetails);
	}
	
	private static String optional(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}
	
	private static String optionalEnd(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit;
	}
	
}
