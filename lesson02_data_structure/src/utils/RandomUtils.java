package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	// Biến/hàm static chỉ khởi tạo 1 lần khi class loading
	private static final Random rd = new Random();
	
	public static double generatePoint() {
		Random rd = new Random();
		double mark = rd.nextDouble(0.0d,11.0d); //[0.10)
		if(mark > 10) {
			mark = 10;
		}
		System.out.println("\nĐiểm = " + mark);
		
		double rounded = bd(mark).setScale(1, RoundingMode.HALF_UP)
						.doubleValue();
		System.out.println("Điểm làm tròn = " + rounded);
		
		return rounded;
	}
	
	// Chuyển đổi KDL double sang BigDecimal
	public static BigDecimal bd(double mark) {
		return new BigDecimal(String.valueOf(mark));
	}
}
