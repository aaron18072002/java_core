package datastructure.primitive;

public class Ex02PrimitiveReassignValues {

	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 33;
		
		float d = 44.44f;
		double e = 55.55d;
		
		System.out.printf
			("a(%s) b(%s) c(%s) d(%s) e(%s)\n",a,b,c,d,e);
		
		long f = Integer.MAX_VALUE + 1;
		int g = (int)f;
		
		System.out.printf("g(%s)\n", g);
	}

}
