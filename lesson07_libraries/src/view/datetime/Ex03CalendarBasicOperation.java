package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03CalendarBasicOperation {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, Calendar.JUNE);
		
		System.out.println("Thời gian hiện tại: " + c);
		
		System.out.println("===================");
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		int hour = c.get(Calendar.HOUR); // CLOCK 12
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.MINUTE);
		String ap = c.get(Calendar.AM_PM) == 1 ? "AM" : "PM";
		
		System.out.printf("Ngày tháng năm: %d/%d/%d\n",year,month,dayOfMonth);
		System.out.printf("Giờ phút giây: %d:%d:%d %s\n",hour,minute,second,ap);
		
		int daysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Số ngày trong tháng " + month + " là " + daysOfMonth);
		
		// Muốn print ở định dạng này kia thì ko get ra...	
		// Format: KDL --> String mà ko ảnh hưởng đến kết quả
		Locale vnLc = new Locale("vi","VN");
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss EEEE",vnLc);		
		Date date = c.getTime();
		String formated = df.format(date);
		System.out.println("formated --> " + formated);
		
		// ngày này năm sau là thứ mấy
		c.add(Calendar.YEAR, 1);
		formated = df.format(c.getTime());
		System.out.println("formated after 1 year --> " + formated);
	}
	
}
