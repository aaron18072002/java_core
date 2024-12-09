package view.datetime;

import java.util.Date;

public class Ex01InitialDate {

	public static void main(String[] args) {
		
		// Lưu trữ Date, Calendar
		
		// Múi giờ 
		// ICT: Indochina time: giờ đông dương
		
		// Mặc định: lấy theo múi giờ hiện tại của máy đang triển khai
		// Có thể set múi giờ nào
		
		// Lấy ra time hiện tại
		Date date = new Date();
		System.out.println("1. Date --> " + date);
		
		date = new Date(2024,10,20);
		System.out.println("2. Date arbitrary --> " + date);
		
		// Máy tính: Mốc thời gian 1.1.1970 6:0:0 UTC+0
		date = new Date(21600000);
		System.out.println("3. Date arbitrary --> " + date);
		
	}
	
}
