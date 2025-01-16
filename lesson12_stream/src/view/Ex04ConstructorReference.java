package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex04ConstructorReference {

	public static void main(String[] args) {
		
		/*
			1. Method Reference
			 + Bất kỳ lambda nào, mình để có thể chuyển sang method reference
			 + Static, Non-Static method reference
			 
			 2. Constructor Reference
			 + Để lambda có thể chuyển sang Constructor Reference thì
			   yêu cầu body của lambda trả về một đối tượng được tạo ra
			   từ constructor của class
			   
			 
			 Sử dụng lambda khi nào
			 ======================
			 + Khai báo hàm hoặc dùng hàm có sẵn, hàm có tham số là
			   functional interface --> tạo đối tượng cho FI đó -->
			   dùng lambda để code ngắn gọn
			 
			 + Áp dụng trong strategy pattern
			 
			 Functional Interface có sẵn trong JAVA
			 =========================
			 Predicate<T>: T -> boolean
			 Function<T,R>: T -> R
			 Supplier<T>: () -> T
		 */
		
		// Ví dụ: có hàm có tham số là Supplier<T>, khi gọi
		// hàm thì phải tạo ra đối tượng của Supplier để truyền vào
		
		// anonymous class
		Supplier<Item> s1 = new Supplier<Item>() {
			@Override
			public Item get() {
				return new Item();
			}
		};
		
		// lambda
		Supplier<Item> s2 = () -> {
			return new Item();
		};
		
		// static method reference
		Supplier<Item> s3 = Item::init;
		
		// constructor reference
		// Supplier<T>: () -> T
		// Item::new tự biết dùng hàm khởi tạo ko có tham số
		Supplier<Item> s4 = Item::new;
		
		// Ví dụ 1
		// Cho input là List<Apple>
		// Yêu cầu: In ra danh sách tất cả địa phương là nơi xuất xứ của Apple
		// 1. Yêu cầu chưa sắp xếp
		// 2. Yêu cầu đã sắp xếp tăng dần
		
		List<Apple> inventory = DataModel.getApples();
		
		// var cities2 = map(inventory, Apple::getOrigin);
		Set<String> cities = map(inventory, a -> a.getOrigin());
		
		CollectionUtils.generate("1. Xuất xứ", cities);
		
	}
	
	private static <T,R> Set<R> map(List<T> inventory, Function<T, R> func) {
		Set<R> result = new HashSet<R>();
		for(T apple : inventory) {
			result.add(func.apply(apple));
		}
		
		return result;
	}
	
}
