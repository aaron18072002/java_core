package inheritance.iinterface;

public interface Shape extends Style {
	
	// mặc định có thêm từ khóa public static final
	// thuộc phạm vi của interface
	String color = "#fff";
	
	// 1 hàm trong interface mặc định có từ khóa 
	// là abstract và public
	// hàm bên dưới chỉ có phần khai báo, ko có thân hàm
	// --> hàm trừu tượng, abstract method
	
	void calcS();
}
