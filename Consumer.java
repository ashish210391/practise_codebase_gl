package test;
import java.util.Queue;

public class Consumer implements Runnable {

	private Queue<Integer> sharedQueue;

	public Consumer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQueue) {
				if (sharedQueue.isEmpty()) {
					System.out.println("Waiting for producer to produce item...");
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int item = sharedQueue.poll();
				System.out.println("Item consumed == " + item);
				sharedQueue.notify();
			}

		}
	}

}
