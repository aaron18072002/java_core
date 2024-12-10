package view.localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateTimeUtils.*;

public class Ex04LocalDateTime {
	
	/*
		LocalDateTime
		+ LocalDate --> Period
		+ LocalTime --> Duration
	*/

	public static void main(String[] args) {
		
		DateTimeFormatter dtFormatter = DateTimeFormatter
				.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		LocalDateTime start = LocalDateTime.parse("12.10.2018 23:10:10", dtFormatter);
		LocalDateTime end = LocalDateTime.parse("06.12.2024 21:48:50", dtFormatter);
		
		System.out.println("Bắt đầu: " + start);
		System.out.println("Kết thúc: " + end);
		
		// Viết chương trình tìm hiệu giữa 2 mốc thời gian
		// ? năm ? tháng ? ngày ? giờ ? phút giây
		
		Duration duration = Duration.between(start, end);
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
		}
		
		System.out.println("Khoảng thời gian --> " 
				+ optional(period.getYears(), "năm")
				+ optional(period.getMonths(), "tháng")
				+ optional(period.getDays(), "ngày")
				+ optional(duration.toHoursPart(), "giờ")
				+ optional(duration.toMinutesPart(), "phút")
				+ optional(duration.toSecondsPart(), "giây"));
		
	}
	
}
