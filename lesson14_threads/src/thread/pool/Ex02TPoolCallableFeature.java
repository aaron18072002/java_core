package thread.pool;

import static utils.ThreadUtils.startThread;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Ex02TPoolCallableFeature {

	private static Random rd = new Random();

	public static void main(String[] args) {

		// Giả lập có N Tasks
		List<Task> tasks = createTasksToBeExecuted(10);

		// Giả lập Thread Pool với pool size = x (<= number of logical processors)
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors ==> " + processors);
		ExecutorService service = Executors.newFixedThreadPool(4);

		// Thread Pool đi thực thi N tasks đồng thời
		// ExecutorService#execute(Runnable) --> void
		// ExecutorService#execute(Callable<T>) --> Future<T>
		for (Task task : tasks) {
			Future<String> future = service.submit(task);
			try {
				String rgbColor = future.get();
				System.out.println("rgbColor --> " + rgbColor);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Duyệt các task tuần tự
		// Các task được thực thi 1 cách song song bởi các threads trong thread pool

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
