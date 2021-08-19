package corejava.threads.executorservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceWithThreadPoolExecutor {
	
	
	public Runnable runnable(String msg) {
		
		return new  Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("This is runnable with Task "+msg);
			}
		};
	}
	
	
	public static void main(String[] args) {
		ExecutorServiceWithThreadPoolExecutor exec = new ExecutorServiceWithThreadPoolExecutor();
		
		ExecutorService execService = new ThreadPoolExecutor(5,10, 3000,
				TimeUnit.MILLISECONDS, 
				new ArrayBlockingQueue<>(10));
		
		
	}

}
