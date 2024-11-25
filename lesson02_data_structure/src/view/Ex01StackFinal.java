package view;

public class Ex01StackFinal {
	public static void main(String[] args) {
		int a = 5;
		final int b = 10;
		int c = 15;
		
		a = b;
		// b = c; //final stack khong the dùng lại toán tử =
		c = a;
	}
}
