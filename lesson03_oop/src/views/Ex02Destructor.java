package views;

import beans.Car;

public class Ex02Destructor {
	public static void main(String[] args) {
		Car c1 = new Car(1,"A1","A11 name",220d); // H1
		
		Car c2 = new Car(2,"A2","A22 name",280d); // H2
		
		Car c3 = c1;
		
		c2 = new Car(22,"A22","A22 name", 440d); // H4
		
		// Ô nhớ, đối tượng ở vị trí H2 không còn được liên kết bởi biến nào
		// ở STACK --> unused, với Java sẽ tự clear những unused objects
		// thông qua cơ chế GARBAGE COLLECTION
		
		// Nguyên nhân
		// Biến trỏ đến đối tượng đó, nó trỏ đến đối tượng hay ô nhớ khác
		// Ô nhớ cũ không được sử dụng
		
		// Có cách nào hạn chế tạo ra các unused objects không?
		// Gán final cho biến KDL đối tượng
	}
}
