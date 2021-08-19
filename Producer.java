package test;
import java.util.Queue;

public class Producer implements Runnable {

	private Queue<Integer> sharedQueue;
	private static final int MAX_SIZE = 1;
	private int item = 0;

	public Producer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQueue) {
				if (sharedQueue.size() == MAX_SIZE) {
					try {
						System.out.println("Waiting for consumer to consume items..");
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				sharedQueue.add(item);
				System.out.println("Item produced == " + item);
				++item;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sharedQueue.notify();
			}

		}
	}

}
