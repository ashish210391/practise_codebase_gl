package corejava.threads;

public class ThreadStackStringStorage {

	public static void main(String[] args) {

		String name = "Ashish kumar";
		String testname = new String("test");
		System.out.println("Hashcode of string name = " + name.hashCode());
		System.out.println("Hashcode of testname == " + testname.hashCode());
		Runnable runnable = () -> {

			String namerunnable = "Ashish kumar";
			String testnamerunnable = new String("test");
			System.out.println("Hashcode of runnable string == " + namerunnable.hashCode());
			System.out.println("Hashcode of testnamerunnable  == " + testnamerunnable.hashCode());

		};

		Thread th = new Thread(runnable);
		th.start();
	}
}
