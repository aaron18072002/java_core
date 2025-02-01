package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
		
	}
	
	public static File createFile(String path) {
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
				file = null;
				ex.printStackTrace();
			}
		} else {
			System.out.println("File " + file.getName() + " is already existed !!!");
		}
		return file;
	}
	
	public static File createFolder(String path) {
		File folder = new File(path);
		if(!folder.exists()) {
			try {			
				boolean isSuccess = folder.mkdir();
				System.out.println("Creating parent folder " + folder.getPath() + " --> " + isSuccess);
			} catch(Exception e) {
				folder = null;
				e.printStackTrace();
			}
		}
		return folder;
	}
	
}
