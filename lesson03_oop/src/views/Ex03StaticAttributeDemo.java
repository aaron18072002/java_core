package views;

import beans.CarAdv;

public class Ex03StaticAttributeDemo {
	public static void main(String[] args) {
		
		// Static ko nên được gán lúc khởi tạo đối tượng
		CarAdv c1 = new CarAdv("Red");
		CarAdv c2 = new CarAdv("Green");
		CarAdv c3 = new CarAdv("Blue");
		CarAdv c4 = new CarAdv("White");
		CarAdv c5 = new CarAdv("Black");
		
		// Sang tên hãng xe từ Audi sang MG
		// c3.setModel("MG");
		// CarAdv.setModel("Honda");
		CarAdv.model = "MG";
		
		// Thuộc tính model nên được quản lý sử dụng
		// cho tất cả các đối tượng của class CarAdv
		
		System.out.println("c1 --> " + c1.toString());
		System.out.println("c2 --> " + c2.toString());
		System.out.println("c3 --> " + c3.toString());
		System.out.println("c4 --> " + c4.toString());
		System.out.println("c5 --> " + c5.toString());
	}
}
