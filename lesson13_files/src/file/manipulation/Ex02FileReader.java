package file.manipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Ex02FileReader {

	public static void main(String[] args) {
		
		File file = new File("testcase/test01.txt");
		
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			lines.forEach(s -> System.out.println(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
