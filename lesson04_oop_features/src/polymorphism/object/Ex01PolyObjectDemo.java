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
		
		Square s4 = (Square)new Square();
		s4.setBackground();
		
		s1.calcS();
		s2.calcS();
		s3.calcS();
		
		/*
			Câu hỏi 1: Biến KDL con trỏ đến đối tượng KDL cha được không?
			Vì sao?
			
			+ Khi lấy KDL con gọi đến hàm riêng, tại thời điểm runtime ko thể
			tìm thấy hàm riêng đó tại KDL cha.
				--> Lỗi ngay tại thời điểm gán đối tượng KDL cha cho biến KDL con
			
			Câu hỏi 2: Tại sao không code trực tiếp biến KDL nào trỏ đến đối 
			tượng KDL đó mà phải dùng biến cha trỏ đến con
			
			+ Dễ dàng ép kiểu trong phạm vi cha con, anh em lúc compile
			+ Linh hoạt hơn trong
				--> Tạo mảng: nhận danh sách các phần tử là chính nó hoặc biến 
				KDL con của nó.
				--> Tuyền tham số qua hàm: tham số có thể KDL chính nó hoặc KDL con.
		*/
		
		Shape[] shapes = new Shape[] {s1,s2,s3,square1,recangle1};
		
		// Lúc compile từng phần tử trong shapes --> Shape
		// In ra các đối tượng là hình vuông
		int squareCounter = 0;
		for(Shape shape:shapes) {
			if(shape instanceof Square) {
				squareCounter++;
				((Square) shape).setBackground();
				printf(shape);
			}
		}
		System.out.println("Square conter --> " + squareCounter);
		
	}
	
	private static void printf(Shape shape) {
		System.out.println("Shape --> {");
		System.out.println("\t" + shape.toString());
		System.out.println("}\n");
	}
}
