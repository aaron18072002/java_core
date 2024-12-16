package view.number;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ex02BigDecimalDemo {

	public static void main(String[] args) {
		// Code theo dạng Builder Pattern --> chỉ có 1 thuộc tính value
		
		// Khởi tạo giá trị BigDecimal
		BigDecimal bd1 = new BigDecimal("36429.24654645645");
		BigDecimal bd2 = new BigDecimal(36429.24654645645);
		BigDecimal bd3 = BigDecimal.valueOf(36429.24654645645d);
		
		System.out.println("bd1: " + bd1);
		System.out.println("bd2: " + bd2);
		System.out.println("bd3: " + bd3);
		
		BigDecimal bd4 = new BigDecimal("34629.1234567")
				.add(new BigDecimal("4444.7864321444432423"), MathContext.UNLIMITED);
		System.out.println("bd4: " + bd4.setScale(14,RoundingMode.HALF_UP));
	}
	
}
