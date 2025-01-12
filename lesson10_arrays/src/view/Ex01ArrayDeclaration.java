package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {
	
	public static void main(String[] args) {
		// khai báo và khởi tạo mảng
		
		// Mảng là KDL đối tượng --> giá trị sẽ được lưu tại HEAP
		
		// khai báo mảng int[] có length = 5
		// giá trị mặc định của từng pt là 0
		int[] digits = new int[5];
		
		// khai báo mảng int[] có length = 4
		// giá trị mặc định của pt tại vị trí 0 1 3 4 tương ứng là
		int[] numbers = {2, 8, 12, 22};
		
		// giống cách số 2, thừa new int[]
		// sử dụng khi return nhanh trong hàm
		int[] statuses = new int[] {200, 400, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		// [I@4d591d15
		// package + class --> [I
		// @hashing
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("statuses --> " + Arrays.toString(statuses));
		System.out.println("generatedNumbers --> " + Arrays.toString(generatedNumbers));
		
		modify(generatedNumbers);
		
		System.out.println("generatedNumbers --> " + Arrays.toString(generatedNumbers));
		
		// Mảng đối tượng
		
		Double[] prices = new Double[6];
		Double[] salesPrices = {2d, 5d, null, 8d, 1d};
		Item[] items = {
			new Item(1, "A1", 22d),
			new Item(2, "A2", 44d),
			new Item(3, "A3", 66d),
		};
	}
	
	// int[] elements = generatedNumbers;
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
	private static int[] generateNumbers() {
		return new int[] {1, 2, 3, 4, 5};
	}
	
}
