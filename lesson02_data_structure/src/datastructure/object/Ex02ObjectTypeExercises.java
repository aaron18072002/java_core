package datastructure.object;

import bean.Store;

public class Ex02ObjectTypeExercises {
	public static void main(String[] args) {
		Store store1 = new Store("A",8,16);
		System.out.println(store1.toString());
		
		Store store2 = new Store("B",8,17);
		System.out.println(store2.toString());
		
		Store store3 = new Store("C",9,18);
		System.out.println(store3.toString());
	}
}