package corejava.threads;

public class WithoutReentrantLock {

	private int val =0;
	public  void add(int fval, int sval) {

		int addnum = fval + sval;
		System.out.println("Sum is : " + addnum);
	}

	public  void subtract(int fval, int sval) {
		
		if(val==1)
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return;
		}
		
		synchronized (this) {
			int diff = sval - fval;	
			System.out.println("Diff is : " + diff);
		}
		val++;
		subtract(--fval, --sval);
	}

	public void calculate(int option) {

		switch (option) {

		case 1:
			add(12, 10);
			break;
		case 2:
			subtract(10, 12);
			break;
		default:
			System.out.println("not an option");
		}

	}

	public static void main(String[] args) {

		WithoutReentrantLock lock = new WithoutReentrantLock();
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				lock.calculate(2);
			}
		};

		Thread th = new Thread(runnable);
		th.start();

	}
}
