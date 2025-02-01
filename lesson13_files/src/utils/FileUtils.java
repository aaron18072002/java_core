package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class FileUtils {

	private FileUtils() {
		
	}
	
	public static void writeFile(File file, Iterable<? extends CharSequence> lines) {		
		Path path = file.toPath();
		
		// Thao tác ghi file
		try {
			Files.write(path, lines, StandardOpenOption.APPEND);
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static <T> void writeFile(File file, Collection<T> elements, 
			Function<T, String> transformer) {		
		Path path = file.toPath();
		
		List<String> lines = elements.stream()
				.map(e -> transformer.apply(e)).toList();
		
		// Thao tác ghi file
		try {
			Files.write(path, lines, StandardOpenOption.APPEND);
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// =====================================
	
	public static void deleteFile(File file) {
		if(file.isFile()) {
			file.delete();
		}
	}
	
	public static void deleteFolder(File folder) {
		if(folder.isDirectory()) {
			folder.delete();
		}
	}
	
	public static void deleteFolder(File folder, boolean removeSubFiles) {
		if (folder.isDirectory()) {
			if (removeSubFiles) {
				File[] subFiles = folder.listFiles();
				Arrays.stream(subFiles).forEach(subFile -> {
					subFile.delete();
					System.out.println("deleted file --> " + subFile.getPath());
				});
			}
			folder.delete();
		}
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
