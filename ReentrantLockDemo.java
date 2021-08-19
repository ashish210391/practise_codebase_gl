package corejava.threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	
	ReentrantLock lock = new ReentrantLock();
	int val = 0;
	public void print() {
		
		if(val ==1) {
			try {
				System.out.println("count is 1");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(val == 3) {
			System.out.println("entering the print()");
			return;
		}
		
		try {
			
			lock.lock();
			System.out.println("inside lock");
		}
		finally {
			lock.unlock();
		}
		++val;
		print();
	}
	
	
	public static void main(String[] args) {
		
		ReentrantLockDemo demo = new ReentrantLockDemo();
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.print();
			}
		});
		th.start();
		
	}

}
