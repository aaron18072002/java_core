package view;

public class Ex07Converter {
	public static void main(String[] args) {
		/*
			Bài 7: Viết chương trình chuyển đổi cơ số một số tự nhiên ở 
			hệ cơ số 10 (thập phân) thành số ở hệ cơ số 2(nhị phân)
			VD: Nhập N = 0 → 0
			N = 1 -> 1
			N = 2 -> 10
			N = 3 -> 11
			N = 4 -> 100
			N = 5 -> 101
		*/
		System.out.println("Cơ số 11 --> Thập phân " + convert(11));
	}
	
	private static String convert(int decimal) {
		String binaryAsString = "";
		while(decimal != 0) {
			int modPart = decimal%2;
			binaryAsString = modPart + binaryAsString;
			decimal = decimal/2;
		}
		return binaryAsString;
	}
}