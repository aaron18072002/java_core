package file.manipulation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03FileSerialized {

	public static void main(String[] args) {
		
		File file = new File("testcase/test03.txt");
		
		List<Item> items = DataModel.getItems();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(items);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=== FINISHED ===");
		
	}
	
}
