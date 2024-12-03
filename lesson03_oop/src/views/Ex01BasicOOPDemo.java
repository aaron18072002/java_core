package views;

import beans.Car;

public class Ex01BasicOOPDemo {
	public static void main(String[] args) {
		Car car1 = new Car(1,"vinfast","vf5",2000d);
		Car car2 = new Car(2,"vinfast","vf8",3000d);
		Car car3 = car1;
		
		// gán giá trị cho thuộc tính
		// car1.salesPrice = 2600d;
		car1.setSalesPrice(2600d);
		
		// in ra giá của vf8
		System.out.println("vf8 --> " + car2.getSalesPrice());
		
		System.out.println("c1 --> " + car1.toString());
		System.out.println("c2 --> " + car2.toString());
		System.out.println("c3 --> " + car3.toString());
		
		Car car4 = new Car();
		car4.setId(44);
	}
}
