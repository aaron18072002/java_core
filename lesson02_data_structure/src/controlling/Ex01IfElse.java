package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		/*
		Câu 1: Random 1 số nguyên ngẫu nhiên [5, 20) Kiểm tra số đó có phải là số chẵn hay ko
		+ Nếu là chẵn --> in ra năm hiện tại + số đó
		+ Ngược lại --> ko làm gì cả
		*/
		
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		System.out.println("Giá trị ngẫu nhiên --> " + number);
		
		//Lấy năm hiện tại
		int currentYear = Year.now().getValue();
		
		if(number%2 == 0) {
			System.out.println("Thông tin --> " + (currentYear + number));
		} else {
			
		}
		
		/*
			Câu 2: Nhập vào mật khẩu
			Kiểm tra độ dài của mật khẩu đó
			+ Nếu đội dài >= 8 --> in ra mật khẩu hợp lệ
			+ Ngược lại
			--> in ra mật khẩu không hợp lệ vui lòng nhập lại
		*/
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		if(password.length() < 8) {
			System.out.println("Mật khẩu không hợp lệ");
		} else {
			System.out.println("Mật khẩu hợp lệ, vui lòng nhập lại");
		}
		
		// đóng kết nối của Scanner
		ip.close();
		
		/* 
			Câu 3:
			Random điểm trung bình (số thực) của học sinh [0.0, 10.0]
			KQ: số ko biết dc số thập phân bao nhiêu, làm tròn lấy 1 chữ số 
			thập phân (UP,DOWN,COMMERCIAL)
			Nếu điểm mà:
			+ [0,5) : Yếu
			+ [5, 6.5): Trung Bình
			+ [6.5, 8): Khá
			+ [8, 10] : Giỏi
		*/
		
		double mark = rd.nextDouble(0.0d,11.0d); //[0.10)
		if(mark > 10) {
			mark = 10;
		}
		System.out.println("\nĐiểm = " + mark);
		
		double rounded = bd(mark).setScale(1, RoundingMode.HALF_UP)
						.doubleValue();
		System.out.println("Điểm làm tròn = " + rounded);
		
		if(rounded < 5) {
			System.out.println("Yếu");
		} else if(rounded < 6.5) {
			System.out.println("Trung bình");
		} else if(rounded < 8) {
			System.out.println("Khá");
		} else {
			System.out.println("Giỏi");
		}
	}
	
	private static BigDecimal bd(double mark) {
		return new BigDecimal(String.valueOf(mark));
	}
}
