package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		// Primitive Data Type
		char a = 'A';
		System.out.printf("a -> %s\n\n",a);
		
		// Object Data Type
		// VP:
		//	 : đang tạo 1 đối tượng Item nằm ở HEAP
		//	 : 1 ô nhớ nằm ở HEAP
		// VT: Item -> KDL
		// item1 -> tên biến
		Item item1 = new Item();
		item1.id = 1; // gán giá trị cho id của ô nhớ mà item1 đang trỏ đến
		item1.name = "A";
		System.out.printf("item1 toString = %s\n", item1.toString());
		// getClass().getName() + "@" + Integer.toHexString(hashCode());
		
		Item item2 = new Item();
		item2.id = 2;
		item2.name = "B";
		item2.salesPrice = 22d;
		System.out.printf("item2 toString = %s\n", item2.toString());
		
		Item item3 = new Item(3,"C",33d);
		System.out.printf("item3 toString = %s\n", item3.toString());
	}
}
