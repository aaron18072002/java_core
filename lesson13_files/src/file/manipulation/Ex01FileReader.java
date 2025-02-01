package file.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex01FileReader {
	
	public static void main(String[] args) {
		
		//File file = new File("testcase/test01.txt");
		
		Path path = Paths.get("testcase/test01.txt");
		
		List<Item> items = DataModel.getItems();
		
		// chuyển đổi sang Iterable<String> lines trước khi lưu vào file
		List<String> lines = items.stream()
				.map(i -> Item.toLine(i)).toList();
		
		// Thao tác ghi file
		try {
			Files.write(path, lines, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=== FINISHED ===");
		
	}
	
}
