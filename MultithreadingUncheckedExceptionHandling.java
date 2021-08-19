package test;

public class MultithreadingUncheckedExceptionHandling {

	public static Runnable getRunnable() {

		return () -> {
			System.out.println("Inside run method");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			throw new RuntimeException("This is run method exception");
		};

	}

	public static void main(String[] args) {
		
		Runnable runnable = getRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//for(long i=0;i<1000000;i++);
		System.out.println("Completed run method");
	}

}
