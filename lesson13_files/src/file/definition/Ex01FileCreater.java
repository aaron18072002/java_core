package file.definition;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreater {

	/**
	 Tạo file, folder sử dụng class java.io.File hoặc
	 java.nio.file.Path trong Java
	 
	 + file --> createNewFile
	 + folder --> mkdir/mkdirs
	 
	 */
	public static void main(String[] args) {
		
		// path: filename, path from parent folder to filename
		//		: relative path(đường dẫn tương đối, path ko có trên ở đĩa)
		//			--> từ vị trí đang đứng của dự án
		//		: absolute path(đường dẫn tuyệt tối) -->  tạo từ giá trị path truyền vào
		
		// mặc định: tạo file trong folder chưa tồn tại --> báo lỗi
		
		System.out.println("=== START ===");
		
		File file = new File("public/data.txt");
		if(!file.exists()) {		
			File parentFile = file.getParentFile();
			System.out.println("parent path --> " + parentFile.getPath());
			boolean isSuccess = false;
			if(!parentFile.exists()) {
				isSuccess = parentFile.mkdir();
				System.out.println("Creating parent folder " + parentFile.getPath() + " --> " + isSuccess);
			}
			
			try {
				isSuccess = file.createNewFile();
				System.out.println("Creating file " + file.getPath() + " --> " + isSuccess);
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		} else {
			System.out.println("File " + file.getName() + " is already existed !!!");
		}
		
		System.out.println("=== END ===");
		
	}
	
}
