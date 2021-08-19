package corejava.threads.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo2 {


	private static Callable<String> getCallable(){
		
		return ()->{
			
			System.out.println("inside callable ");
			Thread.sleep(10000);
			System.out.println("after waking up from the sleep");
			String msg = Thread.currentThread().getName()+" execution is done";
			return msg;
			
		};
	}
	
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		Future<String> submit = executorService.submit(getCallable());
		
		int counter =0;
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			counter+=i;
		}
		System.out.println("counter=== "+counter);
		
		System.out.println("Before calling the future.get()");
		
		String string = submit.get();
		
		System.out.println("After calling the future.get()"+string);
		
	}
	
	
	
	
	
	
}



