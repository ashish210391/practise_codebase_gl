package corejava.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {

	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();

		Thread th1 = new Thread(new Runnable1(lock1, lock2));
		Thread th2 = new Thread(new Runnable2(lock1, lock2));

		th1.start();
		th2.start();
	}

}
