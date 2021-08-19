package test;

public class MultiThreadingCheckedExceptionHandling {

	static int age;
	private static Runnable runnable() {
		return new Runnable() {

			@Override
			public void run() {

				System.out.println("Inside run method of runnable()");
			}
		};
	}

	private static void test_checked_exception() throws CustomCheckedException {

		throw new CustomCheckedException();
	}

	public static void main(String[] args) {
		
		age=age+1;

		Runnable runnable = runnable();
		Thread th = new Thread(runnable);
		th.start();
		System.out.println("Completed main()");
	}

	private static class CustomCheckedException extends Exception {

		public CustomCheckedException() {
			super();
		}

	}
}
