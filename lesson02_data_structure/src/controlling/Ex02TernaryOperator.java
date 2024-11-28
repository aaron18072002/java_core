package controlling;

import java.util.Random;

import utils.RandomUtils;

public class Ex02TernaryOperator {
	public static void main(String[] args) {
		/*
			Toán tử 3 ngôi:
			Cách làm khác của if else else if
			Sử dụng tt3n trong 1 số trường hợp "đơn giản" để làm gọn code
			Câu 1: Cho 2 số a, b. Tìm max của a,b
		*/
		
		Random rd = new Random();	
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		
		int max = a >= b ? a : b;
		System.out.println("Max là --> " + max);
		
		/* 
			Câu 2:
			Random điểm trung bình (số thực) của học sinh [0.0, 10.0]
			KQ: số ko biết dc số thập phân bao nhiêu, làm tròn lấy 1 chữ số 
			thập phân (UP,DOWN,COMMERCIAL)
			Nếu điểm mà:
			+ [0,5) : Yếu
			+ [5, 6.5): Trung Bình
			+ [6.5, 8): Khá
			+ [8, 10] : Giỏi
		 */
		
		double point = RandomUtils.generatePoint();
		String rank = 
				point < 5 ? "Yếu" 
					 	  : point < 6.5 ? "Trung bình"
					 	  : point < 8 ? "Khá" : "Yếu";
		System.out.println("Xếp loại --> " + rank);
	}
}
