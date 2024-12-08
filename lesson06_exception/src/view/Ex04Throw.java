package view;

public class Ex04Throw {
	
	/*
		Thường sẽ sử dụng throw trong các hàm
		
		Khi trong hàm có đoạn code bị lỗi ... --> có thể dùng throw
		để ném lỗi đó đi --> chỗ gọi hàm phải xử lý(ném tiếp hoặc bị bắt)
	*/
	
	public static void main(String[] args) {
		
		// BT2: Hàm xử lý phép chia số nguyên cơ bản
		
		// th1: validated
		System.out.println("th1 --> " + div(6,2));
		
		// th2: non-validation
		try {
			System.out.println("th2 --> " + div(6,0));	
		} catch(ArithmeticException e) {
			System.out.println(">>> exp --> " + e.getMessage());
		}
	}
	
	// Nguyên nhân dẫn đến exception
	// vì den = 0
	// do bên ngoài truyền vào bị sai
	
	// th1: nếu bên ngoài(chỗ gọi hàm) đảm bảo (validate)
	//	    den luôn != 0 kbh bị exception --> try/catch bị thừa
	
	// th2: nếu bên ngoài(chỗ gọi hàm) chưa đảm bảo (validate)
	//		try/catch hợp lí
	
	private static int div(int num, int den) {
		if(den == 0) {
			throw new ArithmeticException("Please enter denominator != 0");
		}
		return num/den;
	}
	
}
