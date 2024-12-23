package string.exercises;

public class Ex01Demo {
	
	/*
		1. Tính chiều dài của chuỗi s
		
		2. Nối chuỗi s1 vào chuỗi s
		
		3. Lấy một ký tự tại vị trí index (3) trong chuỗi s
		
		4. Duyệt từng kí tự, từ trong chuỗi 
		
		5. Tìm vi trí chỉ số xuất hiện đầu tiên, cuối cùng
		
		6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || 
	  	   kết thúc trong chuỗi s không.
	  	   
		7. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		
		8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		
		9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		
		10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	 */

	public static void main(String[] args) {
		String s1 = "hello vietnam";
		String s2 = "- danang";
		String s3 = "- hue";
		
	}
	
	public static int c1Length(String str) {
		return str.length();
	}
	
	public static String c2Concat(String s1,String s2) {
		return s1.concat(s2);
	}
	
	public static Character c3FindCharAtIndex3(String str) {
		if(c1Length(str) < 4) {
			return null;
		}
		return str.charAt(3);
	}
	
	public static void c4PrintEachLetter(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.println("char["+ i + "] = " + str.charAt(i));
		}
	}
	
}
