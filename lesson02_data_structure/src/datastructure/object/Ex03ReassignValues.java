package datastructure.object;

import bean.Item;

public class Ex03ReassignValues {
	public static void main(String[] args) {
		// Cập nhật giá trị cho biến KDL nguyên thủy
		// KNT	--> thông qua toán tử =
		int a = 5;
		int b = 10;
		a = b;
		b = 20;	
		// Cập nhật giá trị của ô nhớ mà biến đang trỏ đến trong STACK
		
		// Cập nhật giá trị cho biến KDL đối tượng
		// KDT
		Item i1 = new Item(1, "A", 11d);
		Item i2 = new Item(2, "B", 22d);
		Item i3 = new Item(3, "C", 33d);
		
		System.out.println("i1 address " + System.identityHashCode(i1));
		System.out.println("i2 address " + System.identityHashCode(i2));
		System.out.println("i3 address " + System.identityHashCode(i3));
		
		System.out.println("--------------------------------");
		
		// Cách1: Cập nhật địa chỉ của biến -> trỏ đến ô nhớ khác trong HEAP
		i1 = i3;
		i2 = new Item(4, "D", 44d);
		
		System.out.println("i1 address " + System.identityHashCode(i1));
		System.out.println("i2 address " + System.identityHashCode(i2));
		System.out.println("i3 address " + System.identityHashCode(i3));
		
		// Cách2: Cập nhật giá trị của thuộc tính trong ô nhớ HEAP mà biến 
		// đang trỏ đến trong STACK
		i1.name = "A1";
	}
}
