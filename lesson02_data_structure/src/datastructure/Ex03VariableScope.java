package datastructure;

public class Ex03VariableScope {

	public static void main(String[] args) {
		char a1 = 'A';
		char a3 = test02();
		
		test01(a1,a3);
	}
	
	// char pA = a1;
	private static void test01(char pA, char pB) {
		char a2 = 'B';		
		System.out.printf("pA(%s)\n",pA);
		System.out.printf("pB(%s)\n",pB);
		System.out.printf("a2(%s)\n",a2);
	}
	
	private static char test02() {
		char a3 = 'C';
		System.out.printf("a3(%s)\n",a3);
		return a3;
	}
}
