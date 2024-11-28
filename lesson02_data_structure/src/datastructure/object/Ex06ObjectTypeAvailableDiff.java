package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
	public static void main(String[] args) {
		// Giống nhau: 
		// + KDL đối tượng lưu ở HEAP, chuỗi
		// + Đối tượng được tạo ra ở HEAP, đối tượng sẽ bất biến(immutable)
		//	--> Vì thuộc tính là private final
		
		// immutable: bất biến ở HEAP
		// final	: bất biến ở STACK
		
		// Toán tử new
		// Lưu trữ: HEAP
		// Sử dụng new thì luôn luôn tạo ra 1 ô nhớ mới trong HEAP
		String s1 = new String("hello");
		String s2 = new String("xin chao");
		String s3 = new String("hello");
		
		System.out.printf("s1[value=%s](hash=%s)\ns2[value=%s](hash=%s)\ns3[value=%s](hash=%s)\n",
				s1, System.identityHashCode(s1),
				s2, System.identityHashCode(s2),
				s3, System.identityHashCode(s3));
		
		System.out.println("\n---------------------\n");
		
		// Gán trực tiếp giá trị
		
		// Lưu trữ: HEAP - CONSTANT pool
		// CONSTANT pool là vùng nhớ dùng để lưu tất cả
		// các giá trị KHÔNG trùng nhau
		
		// Khi tạo 1 đối tượng mới --> kiểm tra xem giá trị của đối 
		// tượng cần tạo đã tồn tại ở CONSTANT pool hay chưa
		// + Nếu chưa có --> tạo ô nhớ, gán địa chỉ cho biến
		// + Nếu có rồi --> ko tạo ra, dùng ô nhớ đã có gán địa chỉ cho biến
		
		String s11 = "bye";
		String s22 = "tam biet";
		String s33 = "bye";
		String s44 = "bye";
		s33 = "Teo";
		System.out.printf("s11[value=%s](hash=%s)\ns22[value=%s](hash=%s)\ns33[value=%s](hash=%s)\ns44[value=%s](hash=%s)",
				s11, System.identityHashCode(s11),
				s22, System.identityHashCode(s22),
				s33, System.identityHashCode(s33),
				s44, System.identityHashCode(s44));
	}
}
