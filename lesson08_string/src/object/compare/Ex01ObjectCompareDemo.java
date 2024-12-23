package object.compare;

import bean.Item;

public class Ex01ObjectCompareDemo {
	/*
	 	Để so sánh GIÁ TRỊ:
	 	
	 	+ KDL nguyên thủy: dùng toán tử > < =
	 	+ KDL đối tượng:
	 		--> .equals(o): Hàm ở class 'Object' sau đó sẽ override lại
	 					  : Mặc định sẽ so sánh với toán tử == (STACK)
	 					  : Mong muốn so sánh giá trị của đối tượng
	 		--> .compareTo(o): Hàm ở interface Comparable<T> sau
	 							đó sẽ override lại
	 						 : Mặc định là hàm trừu tượng
	 */

	public static void main(String[] args) {
		Item i1 = new Item(); // H1
		Item i2 = new Item(); // H2
		Item i3 = new Item(1, "A"); // H3
		Item i4 = new Item(1, "A"); // H4
		
		System.out.println("eq(i1,i2) --> " + i1.equals(i2));
	}
	
}
