package thread.pool;

import static utils.ThreadUtils.startThread;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class Ex03TPoolCallableFutureTask {

	private static Random rd = new Random();

	public static void main(String[] args) {

		// Giả lập có N Tasks
		List<Task> tasks = createTasksToBeExecuted(10);

		// Giả lập Thread Pool với pool size = x (<= number of logical processors)
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors ==> " + processors);
		ExecutorService service = Executors.newFixedThreadPool(4);

		// ExecutorService#execute(Runnable) --> void
		// ExecutorService#execute(Callable<T>) --> Future<T>
		// ExecutorService#execute(Runnable) --> Future<?>
		for (Task task : tasks) {
			service.submit(new FutureTask<>(task));
		}

		service.shutdown();

	}
	
	private static List<Task> createTasksToBeExecuted(int amount) {
		return IntStream.rangeClosed(1, amount) // IntStream
			.boxed() // Stream<Integer>
			.map(i -> new Task()) // Steam<Task>
			.toList();
	}

	private static class Task implements Callable<String> {

		@Override
		public String call() throws Exception {
			startThread("--> random color using RGB");
			return "rgb(" 
					+ rd.nextInt(256) + ", "
					+ rd.nextInt(256) + ", "
					+ rd.nextInt(256) + ")";
		}

	}
	
}
