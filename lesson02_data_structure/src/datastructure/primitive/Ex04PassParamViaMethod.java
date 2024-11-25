package datastructure.primitive;

public class Ex04PassParamViaMethod {

	public static void main(String[] args) {
		int number = 22;
		int age = 18;	
		age = number;
		
		modify(number);
		
		int a1 = 11;
		int a2 = 22;
		System.out.printf("a1(%s) a2(%s)\n",a1,a2);
		swap(a1, a2);
		System.out.printf("a1(%s) a2(%s)\n",a1,a2);
	}
	
	private static void swap(int a1, int a2) {
		a1 = a1 + a2;
		a2 = a1 - a2;
		a1 = a1 - a2;
		System.out.printf("a1(%s) a2(%s)\n",a1,a2);	
	}
	
	private static void modify(int number) {
		number = 999;
	}
}
