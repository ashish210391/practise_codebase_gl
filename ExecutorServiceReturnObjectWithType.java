package corejava.threads.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceReturnObjectWithType {

	
	
	public static Runnable getRunnable() {
		
		return ()->{
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("exception occurred ");
			}
			
			System.out.println("return runnable");
		};
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<?> submit2 = service.submit(getRunnable());
		
		String st = new String();
		Future<String> submit = service.submit(getRunnable(),st );
		
		try {
			String string = submit.get();
			
			System.out.println("Result == ");
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}
}
