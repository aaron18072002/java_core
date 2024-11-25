package datastructure.primitive;

public class Ex03VariableScope {
	public static final int g1 = 1_000_000;
	private static final int g2 = 200_000;

	public static void main(String[] args) {
		System.out.printf("main g1 -> %s\n",g1);
		System.out.printf("main g2 -> %s\n",g2);
		
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
