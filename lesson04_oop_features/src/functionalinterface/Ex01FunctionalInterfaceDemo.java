package functionalinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// Tạo đối tượng cho 1 interface
		
		// c1 --> sử dụng impl class
		IntTest t1 = new IntEvenTest();
		System.out.println("t1 --> " + t1.test(12));
		
		// c2 --> sử dụng anonymous class
		IntTest t2 = new IntTest() {			
			@Override
			public boolean test(int number) {
				return number%5 == 0;
			}
		};
		System.out.println("t2 --> " + t2.test(12));
		
		// c3 --> sử dụng anonymous function, override hàm trừu tượng
		// nhưng mà lúc override ko khai báo tên hàm, KDL trả về 
		// mà chỉ thêm ->
		IntTest t3 = (int number) -> {
			return number%10 == 0;
		};
		System.out.println("t3 --> " + t3.test(12));
		System.out.println("t3 --> " + t3.test(100));
		
		/*
			với anonymous function, lúc override
			+ ko cần điền KDL truyền vào của tham số
			+ nếu số lượng tham số trong hàm override chỉ có 1 tham số 
			--> bỏ luôn ()
			+ nếu phần body override chỉ có 1 dòng code --> bỏ luôn {}, khi bỏ {}
			nếu hàm ko có return --> bỏ luôn return
			
			Đoạn code number -> number%15 == 0;
			
			new IntTest() {			
				@Override
				public boolean test(int number) {
					return number%15 == 0;
				}
			};
		 */
		IntTest t4 = n -> n%15 == 0;
		System.out.println("t4 --> " + t4.test(30));
	}
	
}
