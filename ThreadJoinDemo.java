package corejava.threads;

public class ThreadJoinDemo {

	public static void main(String[] args) {
		System.out.println("main thread started");

		Runnable runnable = () -> {
			System.out.println("runnable thread started");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runnable thread finished");
		};

		Thread th = new Thread(runnable);
		th.setDaemon(true);
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main thread finished");
	}
}
