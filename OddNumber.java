package test;
import java.util.List;

public class OddNumber implements Runnable {

	private static int sharedValue;
	private Object lock;
	private List<Integer> list;

	public OddNumber(int shareValue, Object lock, List<Integer> list) {
		sharedValue = shareValue;
		this.lock = lock;
		this.list = list;

	}

	@Override
	public void run() {

		while (true) {
			synchronized (lock) {
				if (!isOdd(list.get(0))) {
					try {
					//	System.out.println("Waiting for number to get odd..." + list.get(0));
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int val = list.remove(0);
				//System.out.println("Odd Number: " + val);
				System.out.println(val);
				list.add(0, ++val);
				++sharedValue;
				//System.out.println("Shared value in the odd number === "+sharedValue);
				lock.notify();
			}
		}
	}

	private boolean isOdd(int value) {
		return (value % 2) != 0;
	}

}
