package test;

public class GcFinalizeTest {
	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("inside finalize()");
	}
	public static void main(String[] args) {
		
		System.out.println("inside main()");
		GcFinalizeTest test = new GcFinalizeTest();
		test = null;
		for(int i=0;i<=100000;i++);
		System.gc();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("After waking up");
	}

}
