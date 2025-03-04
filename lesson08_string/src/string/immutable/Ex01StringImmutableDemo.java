package string.immutable;

public class Ex01StringImmutableDemo {

	public static void main(String[] args) {
		// String object --> HEAP
		String o1 = new String("hello");
		String o2 = new String("hello");
		String o3 = new String("vietnam");
		hashing("o1", o1);
		hashing("o2", o2);
		hashing("o3", o3);
		
		System.out.println("\n======================\n");
		
		// String literal --> HEAP --> constant pool
		String l1 = "hi";
		String l2 = "hi";
		String l3 = "lao";
		String l4 = "hi";
		
		l2 = "hello";
		
		hashing("l1", l1);
		hashing("l2", l2);
		hashing("l3", l3);
		hashing("l4", l4);
		
		// Immutable --> Dù là String Object, Literal thì ô nhớ được tạo
		// ra để lưu trữ giá trị ko bao giờ cập nhật được
	}
	
	private static void hashing(String text, String s) {
		System.out.println(text + " --> " + System.identityHashCode(s));
	}
	
}
