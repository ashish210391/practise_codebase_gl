package corejava.threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	private static Runnable getRunnable(String msg) {
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+ " "+msg);
			}
		};
	}
	
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(getRunnable("Task1"));
		executorService.execute(getRunnable("Task2"));
		executorService.execute(getRunnable("Task3"));
		
		
	}
}
