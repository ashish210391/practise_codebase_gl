package test;

public class Delta extends Beta {

	
	public static void main(String[] args) {
		Beta x = new Beta();
		Alpha a = x;
		//Foo f = (Delta)x;
		Foo f1 = (Alpha)x;
		Beta b = (Beta)x;
		
	}
}
