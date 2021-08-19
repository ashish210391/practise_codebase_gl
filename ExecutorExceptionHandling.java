package corejava.threads.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExceptionHandling {

	public static Runnable getRunnable() {

		return () -> {
			System.out.println("My name is Thread :" + Thread.currentThread().getName());
			throw new RuntimeException("runitme exceptipn from runnable");
		};
	}

	public static Runnable getRunnableWithCustomizeException() {

		return () -> {

			throw new ExecutorCustomizedException("this is customized exception");
		};
	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();

		Future<?> submit = executorService.submit(getRunnable());

		try {
			System.out.println(submit.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("Inside exception block " + e.getMessage());
		}

		Future<?> submit2 = executorService.submit(getRunnableWithCustomizeException());

		try {
			submit2.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {

			System.out.println(e.getMessage());
		}

	}

}
