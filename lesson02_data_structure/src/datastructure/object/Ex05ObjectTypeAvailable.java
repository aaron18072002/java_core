package datastructure.object;

public class Ex05ObjectTypeAvailable {
	public static void main(String[] args) {
		// char --> kí tự
		// byte --> số trong bảng ASCII tương ứng với ký tự
		char a = 'A';
		byte a1 = 'A';
		System.out.println("a --> " + a);
		System.out.println("a1 --> " + a1);
		
		Integer i1 = new Integer(10);
		Long l1 = new Long(123l);
		String s1 = new String("word1");
		
		// Chỉ cho phép với KDL đối tượng có sẵn của JAVA
		// Không cần new
		// Vì KDL có sẵn chỉ có duy nhất 1 thuộc tính
		Integer o2 = 123;
		Long l2 = 345l;
		String s2 = "word2";
	}
}
