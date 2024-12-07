package view;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import bean.Player;

public class Ex04AppLove {
	/*
	Bài 4: Xem tướng số tình duyên
	Cho 2 đối tượng Z1, Z2. Với mỗi đối tượng là thông tin của mỗi người tham gia, 
	bao gồm
	họ tên | giới tính | địa chỉ | danh sách sở thích | ngày tháng năm sinh
	Kiểm tra xem họ có phù hợp để đến với nhau không
	Điều kiện để 2 người đến với nhau
	+ Khác giới tính
	+ Hơn kém nhau không quá 8 tuổi
	+ Có chung >= 4 sở thích
	+ Các sở thích sau có thể xem là như nhau: múa hát, Múa Hát, mua hat, MUA HAT
	T
	Viết chương trình xử lý nếu 2 người tham gia thỏa mãn các điều kiện trên 
	thì xuất thông tin của họ và danh sách các sở thích giống nhau
	Nếu 2 người không hợp nhau thì xuất thông tin "Rất tiếc 2 bạn không hợp với nhau!" 
	*/
	
	
	public static void main(String[] args) {
		String[] choices = 
			{"Đá bóng","Bóng chuyền","Cầu lông","Chạy bộ",
			 "Bơi lội","Đọc sách","Đi dạo","Chơi game"};
		
		Player p1 = new Player(
				"Lê Văn Tèo",
				true,
				"Đà Nẵng",
				new String[] {choices[0], choices[2], choices[4], choices[6]},
				LocalDate.of(2000, 11, 22));
		
		Player p2 = new Player(
				"Lê Thị A",
				true,
				"Đà Nẵng",
				new String[] {choices[0], choices[1], choices[2], choices[7], choices[5]},
				LocalDate.of(2008, 10, 28));
		
		isValid(p1,p2);
	}
	
	private static boolean isValid(Player p1, Player p2) {
		// + Khác giới tính
		if(p1.isGender() == p2.isGender()) {
			System.err.println("Không được cùng giới tính");
			return false;
		}
		
		// + Hơn kém nhau không quá 8 tuổi
		LocalDate younger = p1.getDateOfBirth();
		LocalDate older = p2.getDateOfBirth();
		if(younger.isAfter(older)) {
			younger = p2.getDateOfBirth();
			older = p1.getDateOfBirth();
		}
		int yearsDiff = Period.between(younger, older).getYears();
		if(yearsDiff >= 8) {
			System.err.println(">> Chênh nhau hơn 8 tuổi");
			return false;
		}
		
		// + Có chung >= 4 sở thích
		String[] sameHobbies = getSameBobbies(p1, p2);
		if(sameHobbies.length < 4) {
			System.err.println("Yêu cầu chung ít nhất 4 sở thích");
			return false;
		}
		
		// + Các sở thích sau có thể xem là như nhau: múa hát, Múa Hát, mua hat, 
		//	 MUA HAT
		
		return true;
	}
	
	private static String[] getSameBobbies(Player p1, Player p2) {
		String[] p1Hobbies = p1.getHobbies();
		String[] p2Hobbies = p2.getHobbies();
		
		String[] result = new String[Math.min(p1Hobbies.length, p2Hobbies.length)];
		int count = 0; // số phần tử thật sự muốn lưu vào reuslt
		for(String p1Hobby:p1Hobbies) {
			if(isExist(p1Hobby,p2Hobbies)) {
				result[count] = p1Hobby;
				count++;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isExist(String checkingElement, String[] elements) {
		for(String element:elements) {
			if(element.equals(checkingElement)) {
				return true;
			}
		}
		return false;
	}
	
}
