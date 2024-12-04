package polymorphism.object;

public class Ex01PolyObjectDemo {
	
	// Làm chức năng tính diện tích cho các hình
	
	// Hình vuông
	
	// Hình chữ nhật
	
	// Hình tròn
	
	public static void main(String[] args) {
		// Khởi tạo đối tượng bình thường
		Shape shape1 = new Shape();
		Square square1 = new Square();
		Recangle recangle1 = new Recangle();
		
		shape1.calcS();
		square1.calcS();
		recangle1.calcS();
		
		System.out.println("\n==================\n");
		
		// Khởi tạo đối tượng (sử dụng tính đa hình trong đối tượng)
		
		// s1
		// compile: Shape
		// runtime: Square
		
		// compile time: code tại thời điểm đang gõ code
		
		// runtime: code được thực thi
		
		Shape s1 = new Square();
		Shape s2 = new Recangle();
		Shape s3 = s1;
		
		Square s4 = (Square)new Shape();
		s4.setBackground();
		
		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		/*
			Câu hỏi 1: Biến KDL con trỏ đến đối tượng KDL cha được không?
			Vì sao?
			
			Câu hỏi 2: Tại sao không code trực tiếp biến KDL nào trỏ đến đối tượng KDL đó
			mà phải dùng biến cha trỏ đến con
		*/
	}
}
