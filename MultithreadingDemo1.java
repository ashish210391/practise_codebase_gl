package test;

public class MultithreadingDemo1 {

	public void createThread() {
		
		Object lock = new Object();
		Thread oddThread = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock) {
					printNumbers("odd");
				}
			}
		});

		Thread evenThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					oddThread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				printNumbers("even");
			}
		});
		
		startThreads(oddThread, evenThread);

	}

	private void startThreads(Thread... threads) {

		threads[0].start();
		threads[1].start();
	}

	private void printNumbers(String threadName) {
		int i = 0;
		while (i < 10) {
			System.out.println(threadName+" : "+i);
			i++;
		}
	}

	public static void main(String[] args) {

		MultithreadingDemo1 demo = new MultithreadingDemo1();
		demo.createThread();
	}

}
