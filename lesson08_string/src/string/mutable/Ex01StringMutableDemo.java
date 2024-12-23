package string.mutable;

public class Ex01StringMutableDemo {
	
	// String: Immutable
	// Vấn đề: Với những bài toán liên quan đến cập nhật
	//		   giá trị của chuỗi nhiều lần --> tốn vùng nhớ
	// VD: Cho danh sách gồn N phần tử là chuỗi
	//		--> Viết hàm + các chuỗi trong danh sách lại với nhau
	//		["a","b","c","d","e"]
			
	// StringBuffer, StringBuilder: Mutable

	public static void main(String[] args) {
		String[] letters = new String[] {
				"a","b","c","d","e"
		};
		String immutable = "";
		for(String letter:letters) {
			immutable += letter;
			System.out.println("immutable hash --> " 
					+ System.identityHashCode(immutable));
		}
		
		// Phân biệt: StringBuilder và StringBuffer --> Sau bài Thread
		
		System.out.println("==============================");
		
		StringBuilder mutable = new StringBuilder("");
		for(String letter:letters) {
			mutable.append(letter);
			System.out.println("mutable hash --> " 
					+ System.identityHashCode(mutable));
		}
		mutable.reverse().deleteCharAt(2).setCharAt(0,'w');;
		System.out.println("--> mutable result: " + mutable);
	}
	
}
