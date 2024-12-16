package builder;

import java.time.LocalDate;

import builder.Item.Builder;

public class Ex01BuilderDemo {

	public static void main(String[] args) {
		
		// Là builder
		Builder b1 = Item.builder();
		
		Item i1 = b1.withId(1).withName("A").build();
		System.out.println("i1 --> " + i1);
		
		Item i2 = b1.withId(2).withName("B").withAmount(3).build();
		System.out.println("i2 --> " + i2);
		
		// Cach2
		AdvItem advI1 = AdvItem.of()
						.withId(1)
						.withName("Adv1")
						.withExpiredDate(LocalDate.now().plusDays(14))
						.withSalesPrice(22.22d);
		System.out.println("advI1 --> " + advI1);
		
	}
	
}
