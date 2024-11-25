package datastructure.object;

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
		System.out.printf("item1 id = %s\n", item1.id);
		System.out.printf("item1 name = %s\n", item1.name);
		System.out.printf("item1 sales price = %s\n", item1.salesPrice);
		System.out.printf("item1 toString = %s\n", item1.toString());
		// getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}
