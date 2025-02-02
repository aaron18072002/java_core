package thread.core;

import static utils.ThreadUtils.*;

public class Ex04SimpleThreadFeature {

	public static void main(String[] args) {
		
		// single thread
		/*measure("do3TaskFn123", () -> {
			fn1();
			fn2();
			fn3();
		});*/
		
		measure("do3TaskFn123", () -> {			
			Thread t1 = new Thread(new Runnable() {		
				@Override
				public void run() {
					fn1();
				}
			}, "t1");
			
			Thread t2 = new Thread(() -> {
				fn2();
			}, "t2");
			
			Thread t3 = new Thread(() -> {
				fn3();
			}, "t3");
			
			t1.start();
			t2.start();
			t3.start();
			
			// đợi 3 thread t1,t2,t3 hoàn thành thì thread #(main) mới đc thực thi
			// 3 thread t1,t2,t3 vẫn đc xử lý đồng thời
			join(t1);
			join(t2);
			join(t3);
		});
		
		// Vấn đề 1: Khi số lượng tasks cần thực thi đồng thời lớn
		// Vấn đề 2: Mỗi Task = Runnable, làm sao trả về kết quả của Task sau khi đã thực thi
		
	}
	
	private static void fn1() {
		doTask(4);
	}
	
	private static void fn2() {
		doTask(4);
	}
	
	private static void fn3() {
		doTask(4);
	}
	
	private static void measure(String text, Runnable runnable) {
		long start = System.currentTimeMillis();
		runnable.run();
		long end = System.currentTimeMillis();
		System.out.println("measure " + text + " took ==> " + (end-start) + "(ms)");
	}
	
}
