package test;
import java.util.List;

public class EvenNumber implements Runnable {

	private static int sharedValue;
	private Object lock;
	private List<Integer> list;

	public EvenNumber(int sharedVal, Object lock, List<Integer> list) {
		sharedValue = sharedVal;
		this.lock = lock;
		this.list=list;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (lock) {
				if (!isEven(list.get(0))) {
					try {
						//System.out.println("Waiting for the number to get even...."+list.get(0));
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				
				int val =list.remove(0);
				//System.out.println("Even Value : " + val);
				System.out.println(val);
				list.add(0,++val);
				++sharedValue;
			//	System.out.println("Shared value in even number === "+sharedValue);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.notify();
			}

		}
	}

	private boolean isEven(int value) {
		return value % 2 == 0;
	}

}
