package controlling;

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
	}
}
