package file.definition;

import java.io.File;

import utils.FileUtils;

public class Ex02FileRemoval {

	public static void main(String[] args) {
		
		//File file = new File("private/account.txt");
		//file.delete();
		
		//File folder = new File("public");
		//folder.delete();
		File folder = new File("testcase");
		FileUtils.deleteFolder(folder, true);
		
		System.out.println("=== FINISHED ===");
		
	}
	
}
