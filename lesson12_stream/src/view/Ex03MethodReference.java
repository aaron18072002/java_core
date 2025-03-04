package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex03MethodReference {

	public static void main(String[] args) {
		
		// Chuyển sang method reference
		
		// Cách 1: Static method reference --> có công thức
				
		// Cách 2: Non-static method reference --> chỉ có 1 số dạng và học thuộc
		// Dạng 1: (T t) -> t.getMethod() ==> T::getMethod
		Function<Apple, Integer> fi = Apple::getId;
		
		// Cho danh sách apples
		var inventory = DataModel.getApples();
		
		// 1. Lấy ra id của tất cả các apples đó
		generate(
			"1. Lấy ra id của tất cả các apples đó", 
			transform(inventory, a -> a.getId()));
		
		// 2. Lấy ra xuất xứ của tất cả các apples đó.
//		generate(
//				"2. Lấy ra xuất xứ của tất cả các apples đó.", 
//				transform(inventory, Ex03MethodReference::convertToOrigin));
		generate(
			"2. Lấy ra xuất xứ của tất cả các apples đó.", 
			transform(inventory,Apple::getOrigin));
		
	}
	
	// Đặt tên hàm bất kỳ
	// Tham số: chính là tham số của lambda
	// body: chính là body của lambda
	// Dùng khi lambda có body dài
	private static String convertToOrigin(Apple a) {
		return a.getOrigin();
	}
	
	private static <R> List<R> transform(List<Apple> inventory, Function<Apple, R> function) {
		List<R> result = new ArrayList<R>();
		for(Apple apple : inventory) {
			result.add(function.apply(apple));
		}
		
		return result;
	}
	
}
