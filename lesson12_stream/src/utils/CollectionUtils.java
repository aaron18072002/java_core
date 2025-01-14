package utils;

import java.util.Arrays;
import java.util.Collection;

public class CollectionUtils {

	private CollectionUtils() {
	}
	
	public static <T> void generate(String prefix, T[] elements) {
		System.out.println(prefix + " --> {");
		Arrays.stream(elements).forEach(e -> System.out.println("  + " + e));
		System.out.println("}\n");
	}
	
//	public static <T> void generate(String prefix, T[] elements) {
//		generate(prefix, List.of(elements));
//	}
//	
//	public static <K, V> void generate(String prefix, Map<K, V> map) {
//		generate(prefix, map.entrySet());
//	}
//
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + " --> {");
		collection.forEach(e -> System.out.println("  + " + e));
		System.out.println("}\n");
	}

}