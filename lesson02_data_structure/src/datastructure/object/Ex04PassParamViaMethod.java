package datastructure.object;

import bean.Item;

public class Ex04PassParamViaMethod {
	public static void main(String[] args) {
		int digit = 44;
		Item item3 = new Item(3, "C", 33d);
		
		modify(digit);
		modify(item3);
		
		System.out.println("digit ---> " + digit);
		System.out.println("item3 ---> " + item3.toString());
		
		Item item4 = new Item(4,"D",44);
		update(item4);
	}
	
	private static void update(Item element) {
		element.name = "C1";
		element = new Item(5, "E", 55);
	}
	
	private static void modify(int element) {
		element = 55;
	}
	
	// Item element = item3;
	private static void modify(Item element) {
		element.name = "V";
	}
}
