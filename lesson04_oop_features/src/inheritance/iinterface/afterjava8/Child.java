package inheritance.iinterface.afterjava8;

public class Child implements Father,Mother {
	
	// Ko bắt buộc phải override lại các default method
	
	// Nhưng nếu các interface cha có chung phần khai báo hàm
	// thì bắt buộc ở con phải override
	
	@Override
	public void cooking() {
		Father.super.cooking();
	}
	
}
