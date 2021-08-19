package corejava.threads;

public class ClassLevelLocking {

	public static void print(String threadName) {
		
		
		synchronized (ClassLevelLocking.class) {
			System.out.println("thread name == "+threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("inside class level locking " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				print("runnable1");
			}
		};

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				print("runnable2");
			}
		};
		runnable1.run();
		runnable2.run();
	}

}
