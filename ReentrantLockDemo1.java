package corejava.threads;

public class ReentrantLockDemo1 {
	
	private Object object = new Object();

	private void foo() throws InterruptedException {

		synchronized (object) {
			System.out.println("inside foo");
			bar();
		}

	}

	private  void bar() throws InterruptedException {

		synchronized (object) {
			Thread.sleep(1000);
			System.out.println("inside bar");	
		}
	}

	public static void main(String[] args) {

		ReentrantLockDemo1 d1 = new ReentrantLockDemo1();
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					d1.foo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();
	}

}
