package corejava.threads.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo1 {

	public static Runnable getRunnable(String Task1) {

		return () -> {

			System.out.println("Thread name is --- " + Thread.currentThread().getName());
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Future<?> submit = executorService.submit(getRunnable("Task1"));

		Thread.sleep(10000);

		System.out.println("Get the result");
		// submit.get() will hold the runnable and check the status of task and will
		// block the further execution of the main thread
		submit.get();

		System.out.println("Task is executed ");

	}
}
