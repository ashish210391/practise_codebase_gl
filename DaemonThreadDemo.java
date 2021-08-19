package corejava.threads;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		System.out.println("main thread running started");

		Runnable runnable = () -> {
			String name = Thread.currentThread().getName();
			System.out.println("Inside runnable thread");
			System.out.println("current running thread is "+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runnable thread finished");
		};
		Thread th = new Thread(runnable,"runnable thread");
	
		th.setDaemon(true);
		th.start();
		
		System.out.println("main thread running finished");
	}
}
