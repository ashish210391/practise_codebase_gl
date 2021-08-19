package corejava.threads;

public class ThreadDemo {
	
	public static void main(String[] args) {
	
		/*MyThread th = new MyThread();
		th.start();*/
		
		RunnableThread rthread = new RunnableThread();
		Thread thrd = new Thread(rthread);
		thrd.start();
		
		System.out.println("After exec of rthread");
		
	}

}
