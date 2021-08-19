package coreconcepts.demo;

public class ExceptionDemo {
	
	
	
	private void testException() {
		
		
		try {
			int c = 10/0;	
			
		}catch(Exception e ) {
			
		}
		//This is unreachable code
		/*catch(ArithmeticException e) {
			
		}*/
		
		
	}
	
	
	private static void add(int a ,int b) throws ArithmeticException {
		
		throw new ArithmeticException();
		// after this it will be unreachable code
	}
	
	private static void mul(int a, int b) throws CustomCheckedException {
		
		throw new CustomCheckedException("This is my custom checked exception");
	}
	public static void main(String[] args) {
		
		add(1, 2);
		
		try {
			mul(1, 3);
		} catch (CustomCheckedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private void div(int a , int b) {
		
		throw new CustomUncheckedException();
	}
	
	private static class CustomCheckedException extends Exception{
		
		
		public CustomCheckedException(String errorMessage) {
			
			super(errorMessage);
		}
		
	}
	
	private static class CustomUncheckedException extends RuntimeException{
		
		public CustomUncheckedException() {
			super();
		}
		
	}

}
