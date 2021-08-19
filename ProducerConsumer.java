package test;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

	
	public static void main(String[] args) {
		
		Queue<Integer> shareQueue= new LinkedList<>();
		
		Producer producer = new Producer(shareQueue);
		Consumer consumer = new Consumer(shareQueue);
		
		Thread prodThread = new Thread(producer);
		Thread consThread = new Thread(consumer);
		
		prodThread.start();
		consThread.start();
		
		
	}
	
}
