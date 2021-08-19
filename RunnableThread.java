package corejava.threads;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		
		
		try {
			Thread.sleep(10000);
			System.out.println("this is runnable thread");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
