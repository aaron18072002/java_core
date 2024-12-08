package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
	private static final Random rd = new Random();

	public static void main(String[] args) throws FileNotFoundException {
		// Giả lập bài toán
		
		// 1. Thực hiện logic, trả về 100 đối tượng
		//	  lưu trong mảng chuỗi String[]
		// 	  Mỗi đối tượng là 1 String,  giá trị các tt cách nhau bởi dấu phẩy,
		String[] calculatedData = mockData(100);
		calculatedData[72] = "72, a, a";
		generate("B1. Dữ liệu sau khi tính toán", calculatedData);
		
		// 2. Thực hiện ghi dữ liệu này vào file(yêu cầu đã tồn tại);
		File file = new File("etest.txt");
		if(!file.exists()) {
			throw new FileNotFoundException("File etest cant be found");
		}
		
		System.out.println("Bắt đầu ghi file");
		FileWriter fw = null;
		try {
			// liên kết, mở file
			fw = new FileWriter(file);
			
			// ghi từng line
			for(String object:calculatedData) {
				String line = convert(object);
				fw.write(line + "\n");
			}
			
			// save/close file
			// ko save/close file đc khi file bị exception
			// fw.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Done ...");
		
		// 3. Đặt vấn đề
		// Khi muốn ghi N(100) dòng dữ liệu vào file
		// Vừa tính toán vừa ghi file, có khả năng tại 1 đối tượng, dòng dữ liệu
		// nào đó(k) tính toán bị lỗi, bị exception
		// Xử lý thế nào ?
		// 1. Xóa hết xem như chưa ghi file
		// 2. Ghi k-1 dòng vào file, còn lại bỏ qua
		// 3. Ghi tất cả vào file ngoại trừ k(ghi error message vào file cho dòng k)
	}
	
	private static String convert(String object) {
		String[] parts = object.split(", ");
		try {
			int age = Integer.parseInt(parts[2]);
			int factor = (age-18)*2;
			return object + ", " + factor;			
		} catch(NumberFormatException ex) {
			return "Error >>> " + ex.getMessage();
		}
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
