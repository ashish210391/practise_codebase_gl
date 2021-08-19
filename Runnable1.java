package corejava.threads;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable {

	private Lock lock1;
	private Lock lock2;

	public Runnable1(Lock lock1, Lock lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;

	}

	@Override
	public void run() {

		System.out.println("Attempting locking lock1 in runnable1.....");
		lock1.lock();
		System.out.println("Acquired lock1 in runnable1...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Attempting locking lock2 in runnable1.....");
		lock2.lock();
		System.out.println("Acquired lock2 in runnable1");

		lock1.unlock();
		System.out.println("unlocking lock1 in runnable1");
		lock2.unlock();
		System.out.println("unlocking lock2 in runnable1");

	}

}
