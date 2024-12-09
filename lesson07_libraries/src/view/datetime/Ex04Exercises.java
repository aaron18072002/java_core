package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex04Exercises {

	public static void main(String[] args) {
		Locale VIETNAM = new Locale("vi","VN"); // fdow
		Calendar c = Calendar.getInstance(); // lấy time hiện tại
//		c.set(Calendar.YEAR, 2021);
		
		// 1. Kiểm tra năm hiện tại có phải là năm nhuận không
		int year = c.get(Calendar.YEAR);
		System.out.println("Năm hiện tại: " + year);
		System.out.println("Có phải năm nhuận hay ko --> " + isLeapYear(year));
		
		// 2. Ngày hiện tại là ngày thứ mấy, in ra ngày theo tiếng việt
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Hôm nay là thứ(số) --> " + dayOfWeek);
		
		DateFormat df = new SimpleDateFormat("EEEE", VIETNAM);
		System.out.println("Hôm nay là thứ(chuỗi) --> " + df.format(c.getTime()));
		
		// 3. In thông tin các ngày trong tháng, tuần hiện tại
		// dd/MM/yyyy week_day
		printDaysInMonth(c);
		printDaysInWeek(c);
		
		// 4. Đếm xem trong tháng có bao nhiêu ngày chủ nhật và in ra
		c.set(Calendar.MONTH, Calendar.OCTOBER);
		Calendar[] sundays = getSundays(c);
		System.out.println("Số ngày chủ nhật --> " + sundays.length);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		for(Calendar sunday:sundays) {
			System.out.println(df.format(sunday.getTime()));
		}
	}
	
	private static Calendar[] getSundays(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, 
				source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		Calendar[] target = new Calendar[10];
		int count = 0;
		
		for(Calendar c = start; c.before(end);) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				Calendar clone = clone(c);
				target[count++] = clone;
				c.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static void printDaysInWeek(Calendar source) {
		Calendar start = clone(source);
		start.add(Calendar.DAY_OF_MONTH, start.getFirstDayOfWeek() - 
				start.get(Calendar.DAY_OF_MONTH));
		Calendar end = clone(source);
		end.set(Calendar.DAY_OF_MONTH, start.get(Calendar.DAY_OF_MONTH) + 7);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		
		System.out.println("\nCác ngày trong tuần hiện tại --> {");
		for(Calendar c = start; c.before(end); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("\t" + df.format(c.getTime()));
		}
		System.out.println("}");
	}
	
	private static void printDaysInMonth(Calendar source) {
		Calendar start = cloneAndSet(source, Calendar.DAY_OF_MONTH, 1);
		Calendar end = cloneAndSet(source, Calendar.DAY_OF_MONTH, 
				source.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");
		
		System.out.println("\nCác ngày trong tháng hiện tại --> {");
		for(Calendar c = start; c.before(end); c.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("\t" + df.format(c.getTime()));
		}
		System.out.println("}");
	}
	
	private static Calendar cloneAndSet(Calendar source,int field,int value) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		target.set(field, value);
		return target;
	}
	
	private static Calendar clone(Calendar source) {
		Calendar target = Calendar.getInstance();
		target.setTimeInMillis(source.getTimeInMillis());
		return target;
	}
	
	private static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	
}
