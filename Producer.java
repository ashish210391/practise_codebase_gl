package corejava.threads;

import java.util.Queue;

public class Producer implements Runnable {

	private Queue<Integer> queue;
	private int count = 0;

	public Producer(Queue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				if (!queue.isEmpty()) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.println("Adding to queue");
				++count;
				queue.add(count);
				System.out.println("notifying to the consumer ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				queue.notify();
			}
		}
	}

}
