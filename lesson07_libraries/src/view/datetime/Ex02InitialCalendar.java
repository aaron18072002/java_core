package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Calendar: Nhiều loại lịch (âm/dương)
		// Tại một thời điểm tạo nhiều Calendar thì giá trị nó chỉ trả
		// về thời gian hiện tại --> sử dụng singleton pattern để
		// chỉ cho phép tạo ra 1 đối tượng duy nhất cho class
		
		// ngày đầu tuần --> phụ thuộc vào locale mà ngôn ngữ đang config
		// locale(country,language): US_EN
		
		System.out.println("default localte --> " + Locale.getDefault());
		Locale.setDefault(new Locale("vi","VN"));
		
		// ăn cho tất cả Calendar,Date
		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
		TimeZone.setDefault(tz);
		
		// lấy thời gian hiện tại
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		// lấy thời gian với múi giờ theo hệ thống
		System.out.println("múi giờ: " + TimeZone.getDefault());
		
		/*
			Có 3 cách chia múi giờ:
			+ UTC +- x
			+ GMT +- x
			+ Zone theo khu vực/quốc gia
		*/
		
		// lấy tất cả các múi giờ mà ngôn ngữ hỗ trợ
		String[] zoneIds = TimeZone.getAvailableIDs();
		System.out.println("Múi giờ ngôn ngữ hỗ trợ:");
		for(String zoneId:zoneIds) {
			System.out.println(zoneId);
		}
	}
	
}
