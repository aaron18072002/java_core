package string.exercises;

public class Ex01Demo {

	public static void main(String[] args) {
		String s1 = "hello vietnam";
		String s2 = "- danang";
		String s33 = "- h u e";
		
		
//		1. Tính chiều dài của chuỗi s
		String s = "da nang***** ";
		System.out.println("Chiều dài của s --> " + s.length());
		
//		2. Nối chuỗi s1 vào chuỗi s
		s = new StringBuilder(s).append(s1).toString();
		System.out.println("s --> " + s);
		
//		3. Lấy một ký tự tại vị trí index (3) trong chuỗi s
		char charAtIndex3 = s.charAt(3);
		System.out.println("Ký tự tại vị trí thứ 3 --> " + charAtIndex3);
		
//		4. Duyệt từng kí tự, từ trong chuỗi 
		
//		5. Tìm vi trí chỉ số xuất hiện đầu tiên, cuối cùng của ký tự
		System.out.println("Bắt đầu: " + s.indexOf("a"));
		System.out.println("Kết thúc: " + s.lastIndexOf("a"));
		
//		6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || 
//	  	   kết thúc trong chuỗi s không.
		// startWith endWith
	  	   
//		7. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		s = s.replace(s1, s2);
		
//		8. Loại bỏ các khoảng trắng thừa của chuỗi s3
		String s3 = "  welcome  to java24   class   ";
		s3 = s3.trim().replaceAll("[\\s]+", " ");
		System.out.println("s3||||" + s3 + "|||||");
		
//		9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		// substring(2);
		// substring(2,5);
	
//		10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	 
		
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
