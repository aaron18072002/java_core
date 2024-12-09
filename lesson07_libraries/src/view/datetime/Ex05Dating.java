package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex05Dating {

	public static void main(String[] args) {
		Calendar start = toCalc("22.11.2024 10:20:30", "dd.MM.yyyy HH:mm:ss");
		Calendar now = Calendar.getInstance();
		
		// Tìm khoảng time giữa start và end
		long durationInMillis = now.getTimeInMillis() - start.getTimeInMillis();
		
		long days = TimeUnit.MILLISECONDS.toDays(durationInMillis);
		System.out.println("Số ngày --> " + days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(durationInMillis);
		System.out.println("Số giờ --> " + hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(durationInMillis);
		System.out.println("Số phút --> " + minutes);
	}
	
	private static Calendar toCalc(String dateAsString,String pattern) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			Date date = df.parse(dateAsString);
			c.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c;
	}
	
}
