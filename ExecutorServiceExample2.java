package corejava.threads.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2 {

	private static Runnable newRunnable(String msg) {
		return () -> {
			System.out.println(Thread.currentThread().getName() + " " + msg);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runnable task is about to finish");
		};

	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<?> submit = executorService.submit(newRunnable("Task1"));
		
		
		if (submit.isDone()) {
			System.out.println("submit is done");
		}
		System.out.println("get() is called later");
		try {
			Object object = submit.get();
			System.out.println("get() is called before");
			System.out.println("object === ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		/*System.out.println("main thread is about to finish");*/
	}

}
