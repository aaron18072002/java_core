package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	
	public static void main(String[] args) {
		
		// Viết chương trình tạo mới 1 file trong java
		try {	
			createFile("etf~~~~~~~~~~~sdfsd#@!$$#$()est.txt");
			System.out.println("Tạo xong rồi");
		} catch(Exception e) {
			
		}
		
	}
	
	private static void createFile(String path) throws IOException {
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile();
		}
	}
	
}
