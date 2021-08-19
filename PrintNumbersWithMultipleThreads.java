package test;

public class PrintNumbersWithMultipleThreads {

	public static Runnable getFirstRunnable() {
		return () -> {
			System.out.println(1);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}

	public static Runnable getSecondRunnable() {

		return () -> {
			System.out.println(2);
		};
	}

	public static Runnable getThirdRunnable() {
		return () -> {
			System.out.println(3);
		};
	}

	public static Runnable getFourthRunnable() {

		return () -> {
			System.out.println(4);
		};
	}

	public static Runnable getFifthRunnable() {
		return () -> {
			System.out.println(5);
		};
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(getFirstRunnable());
		Thread t2 = new Thread(getSecondRunnable());
		Thread t3 = new Thread(getThirdRunnable());
		Thread t4 = new Thread(getFourthRunnable());
		Thread t5 = new Thread(getFifthRunnable());
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		t5.start();
		t5.join();
	}

}
