package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

import static utils.CollectionUtils.*;

interface ApplePredicate<T> {
	boolean test(T t);
}

public class Ex01StrategyPatternPreview {

	public static void main(String[] args) {
		
		var inventory = DataModel.getApples();
		
		// 1st : find all green apples in his inventory
		generate(
			"1st : find all green apples in his inventory", 
			filter(inventory, a -> "green".equals(a.getColor()))
		);
		
		// 2st : find all red apples in his inventory
		generate(
			"2st : find all red apples in his inventory", 
			filter(inventory, a -> "red".equals(a.getColor()))
		);
		
	}
	
	// Quan trọng phải biết bài toán có strategy như thế nào
	// Biết được behavior parameterization có mấy tham số, KDL gì và trả về KDL gì 
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
}
