package corejava.threads.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceWithCallable {

	private static Callable<String> newCallable(String msg) {
		return new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getName() + " " + msg);
				return "Callable for " + msg;
			}
		};
	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<String> submit = executorService.submit(newCallable("Task1"));
		
		try {
			String string = submit.get();
			System.out.println("Callable is done "+string);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}
