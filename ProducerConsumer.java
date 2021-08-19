package corejava.threads;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumer {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}

}
