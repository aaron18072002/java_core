package builder;

import builder.Item.Builder;

public class Ex01BuilderDemo {

	public static void main(String[] args) {
		
		// Là builder
		Builder b1 = Item.builder();
		
		Item i1 = b1.withId(1).withName("A").build();
		System.out.println("i1 --> " + i1);
		
		Item i2 = b1.withId(2).withName("B")
		
	}
	
}
