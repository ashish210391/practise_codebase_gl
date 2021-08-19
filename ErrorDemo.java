package coreconcepts.demo;

public class ErrorDemo {

	private static void errorDemo1() throws Throwable {
		throw new Throwable();
	}
	
	public static void main(String[] args) {
		
		try {
			errorDemo1();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
