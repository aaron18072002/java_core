package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {

	private ThreadUtils() {
		
	}
	
	public static void join(Thread thread) {
		try {
			thread.join(); // các threads khác phải đợt thread ni chạy xong
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void startThread() {
		System.out.println("\n^^^ Thread '" + getCurrentThreadName()
				+ "' is started ....");
	}
	
	public static void startThread(Object info) {
		System.out.println("\n^^^ Thread '" + getCurrentThreadName()
				+ "' is started ...." + info.toString());
	}
	
	public static void endThread() {
		System.out.println("\n### Thread '" + getCurrentThreadName()
				+ "' is finished ....");
	}
	
	public static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	
	/**
	 * Giả lập cho 1 công việc được thực hiện trong bao lâu(giây)
	 * @param secconds
	 */
	public static void doTask(int secconds) {
		try {
			System.out.println("Executing a task by '" + getCurrentThreadName() +
					"' with "+ secconds + "(s)");
			while(secconds != 0) {
				System.out.println(getCurrentThreadName() + " ---> " + secconds);
				TimeUnit.SECONDS.sleep(1);
				secconds--;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
