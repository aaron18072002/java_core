package view;

import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import functional.SumConsumer;

public class Ex02LocalVariable {
	
	private static Double total;

	public static void main(String[] args) {
		
		// Viết hàm tính tổng cân nặng của các quả táo trong
		// kho hàng
		
	}
	
	private static Double sumOfWeights(List<Apple> inventory) {
		// Vì sao trong lambda khi sử dụng biến cục bộ thì biến đó
		// là final hoặc tự chuyển sang final
		
		// Về bản chất khi biến cục bộ sử dụng trong lambda, thật ra biến cục
		// bộ đó đang được sử dung ở 1 class khác
				
		// Đúng nguyên tắc ko cho phép, như khi dùng lambda hoặc anonymous class
		// thì Java vẫn cho phép như yêu cầu final
		
		Double sum = 0.0;
		
		// 2. anonymous class
		inventory.stream().forEach(new Consumer<Apple>() {
			@Override
			public void accept(Apple a) {
				total = total + a.getWeight();
			}
		});
		
		// 3. implementation class
		inventory.stream().forEach(new SumConsumer(sum));
		
		return total;
	}
	
}
