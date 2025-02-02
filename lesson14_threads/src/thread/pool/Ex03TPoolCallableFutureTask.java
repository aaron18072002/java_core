package thread.pool;

import static utils.ThreadUtils.startThread;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class Ex03TPoolCallableFutureTask {

	private static Random rd = new Random();

	public static void main(String[] args) {

		// Giả lập có N Tasks
		List<FutureTask<String>> tasks = createTasksToBeExecuted(10);

		// Giả lập Thread Pool với pool size = x (<= number of logical processors)
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors ==> " + processors);
		ExecutorService service = Executors.newFixedThreadPool(4);

		// ExecutorService#execute(Runnable) --> return void
		// ExecutorService#execute(Callable<T>) --> return Future<T> --> submit xong trả về Future<?>
		// ExecutorService#execute(Runnable) --> return Future<?> --> submit xong trả kết quả vào trong Future<?>
		for (FutureTask<String> task : tasks) {
			service.submit(task);
			
			try {
				System.out.println("task data --> " + task.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} 
		}

		service.shutdown();

	}
	
	private static List<FutureTask<String>> createTasksToBeExecuted(int amount) {
		return IntStream.rangeClosed(1, amount) // IntStream
			.boxed() // Stream<Integer>
			.map(i -> new FutureTask<String>(new Task())) // Steam<FutureTask<String>>
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
