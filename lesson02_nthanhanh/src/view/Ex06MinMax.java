package view;

import utils.NumberUtils;

public class Ex06MinMax {
	public static void main(String[] args) {
		/*
			Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ 
			số a,b,c Biết rằng a, b, c là số nguyên được nhập từ bàn phím
			và nhỏ hơn 20 [0, 20)
			VD: Nhập a = 6 Nhập b = "xyz" Nhập b = 12 Nhập c = 8 báo lỗi, 
			yêu cầu nhập lại
			Số lớn nhất là 12
			Số nhỏ nhất là 6
		*/
		int a = NumberUtils.inputNumber(0, 20, 5, "Nhâp a[0,20): ");
		
		int b = NumberUtils.inputNumber(0, 20, 5, "Nhâp b[0,20): ");
		
		int c = NumberUtils.inputNumber(0, 20, 5, "Nhâp c[0,20): ");
		
		System.out.println("Số lớn nhất là " + max(a,b,c));
	}
	
	private static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}
}
