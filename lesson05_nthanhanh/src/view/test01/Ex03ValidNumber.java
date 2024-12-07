package view.test01;

public class Ex03ValidNumber {
	/*
		Tìm số tự nhiên hợp lệ lớn nhất trong chuỗi. Biết rằng chuỗi chỉ gồm
		các ký tự số và chữ cái không dấu. Ví dụ
		▪ 12abu02muzk586cyx → 586
		▪ Uyk892nn1234uxo2 → 1234
		Method signature: int getMaxValidNumber(….)
	*/
	public static void main(String[] args) {
		String text = "12abu02muzk586cyx";
		System.out.println("Số hợp lệ lớn nhất là " + getMaxValidNumber(text));
	}
	
	private static int getMaxValidNumber(String text) {
		int max = Integer.MIN_VALUE;
		int curNumber = 0;
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(!Character.isDigit(letter)) {
				if(max < curNumber) {
					max = curNumber;
					curNumber = 0;
				}
				continue;
			}
			curNumber = curNumber*10 + Integer.parseInt("" + letter);
		}
		return max;
	}
	
	private static boolean isValidNumber(char letter) {
		if(letter < '0' || letter > '9') {
			return true;
		}
		return false;
	}
	
}
