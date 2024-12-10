package view.v2;

public class Ex01Divided {
	
	/*
		Bài 1: Viết chương trình (hàm) kiểm tra số nguyên N 
		có phải là bội của 2 hay không
		Yêu cầu: N là số nguyên dương được nhập từ bàn phím, 
		bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
		VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
		= 4 true
		= 6 true
		= 7 false
	*/
	
	public static void main(String[] args) {
		int number = 2;
		System.out.println("4 --> " + isMultipleOfNumber(4, number));
		System.out.println("5 --> " + isMultipleOfNumber(5, number));
		System.out.println("6 --> " + isMultipleOfNumber(6, number));
	}
	
	private static boolean isMultipleOfNumber(int target, int number) {
		if(target > number && target%number == 0) {
			return true;
		}
		return false;
	}
	
}
