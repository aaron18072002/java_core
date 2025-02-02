package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {

	private ThreadUtils() {
		
	}
	
	public static void startThread() {
		System.out.println("\n^^^ Thread '" + getCurrentThreadName()
				+ "' is started ....");
	}
	
	public static void endThread() {
		System.out.println("### Thread '" + getCurrentThreadName()
				+ "' is finished ....");
	}
	
	public static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	
	/**
	 * Giả lập cho 1 công việc được thực hiện trong bao lâu(giây)
	 * @param secconds
	 */
	public static void doTest(int secconds) {
		try {
			TimeUnit.SECONDS.sleep(secconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
