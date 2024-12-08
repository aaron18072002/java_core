package view;

import java.util.Random;

public class Ex07Finally {
	private static final Random rd = new Random();

	public static void main(String[] args) {
		// Giả lập bài toán
		
		// 1. Thực hiện logic, trả về 100 đối tượng
		//	  lưu trong mảng chuỗi String[]
		// 	  Mỗi đối tượng là 1 String,  giá trị các tt cách nhau bởi dấu phẩy,
		String[] calculatedData = mockData(100);
		generate("B1. Dữ liệu sau khi tính toán", calculatedData);
	}
	
	// Employee: id,name,age
	private static String[] mockData(int n) {
		String[] employees = new String[n];
		for(int i = 0; i <= n - 1; i++) {
			employees[i] = i+1 + ", " + "Name " + i + ", " + rd.nextInt(18,25);
		}
		return employees;
	}
	
	private static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " --> {");
		for(String element:elements) {
			System.out.println("	+ " + element);
		}
		System.out.println("}\n");
	}
	
}
