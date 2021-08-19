package corejava.threads;

import java.util.Queue;

public class Consumer implements Runnable {

	private Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				if (!queue.isEmpty()) {
					int poll = queue.poll();
					System.out.println("fetching data from the queue " + poll);
					queue.notify();
				}
				System.out.println("Waiting for the producer to produce");
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
