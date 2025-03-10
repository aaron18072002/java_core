package thread.core;

public class Ex05VolatileMainMemory {
	
	// t1 t2 tm --> 3 6 8
    // t1 tm t2 --> 3 5 10

    // t2 t1 tm --> 4 5 7
    // t2 tm t1 --> 4 6 7

    // t3 t1 tm --> 4 5 10
    // t3 tm t1 --> 4 8 9
	
    // volatile     >> read data from main memory
	// non-volatile >> read data from each CPU cache >> reduce wrong case
	private static volatile int counter = 2;
	
	public static void main(String[] args) {
		
		System.out.println(">> Thread main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#thread1 is running ...");
				counter++;
				System.out.println("#thread1 counter: " + counter);
			}
		}, "thread1");
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#thread2 is running ...");
				counter *= 2;
				System.out.println("#thread2 counter: " + counter);
			}
		}, "thread2");
		t2.start();
		
		counter += 2;
		System.out.println("#main counter: " + counter);
		
		System.out.println(">> Thread main end");
		
	}
}
