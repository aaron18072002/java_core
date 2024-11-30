package view;

public class Ex03Factorial {
	public static void main(String[] args) {
		/*
			Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
			Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
			Ví dụ: Nhập N = 1 -> 1! = 1 Nhập N = 5 -> 5! = 5 * 4 * 3 * 2.1 = 120
		*/
		int[] elements = new int[] {5,8,12,3};
		for(int element:elements) {
			System.out.println(element + "! = " + fact(element));
		}
	}
	
	private static long fact(int n) {
		long f = n;
		while(n > 1) {
			n--;
			f = f * n;
		}
		return f;
	}
}
