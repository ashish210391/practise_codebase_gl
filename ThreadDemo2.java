package test;

public class ThreadDemo2 {

	private Object object = new Object();
	boolean val = false;
	public void createThreads() {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				synchronized (object) {
				
					try {
						if(val)
						{
							System.out.println("t1");
							object.wait();
						}
						val=false;
						object.notify();
						
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
					
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				synchronized (object) {
					if(!val) {
						System.out.println("t2");
						val=true;
						object.notify();
					}
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
		});
		
		startThreads(t1,t2);
		
	}
	
	private void startThreads(Thread...threads) {
		threads[0].start();
		threads[1].start();
	}
	
	public static void main(String[] args) {
		ThreadDemo2 demo = new ThreadDemo2();
		demo.createThreads();
	}

}
