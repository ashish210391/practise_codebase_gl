package corejava.serialization;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = "ashish";
		String s2 ="ashish";
		String s3 = new String("kumar");
		String s4 = new String("kumar");
		String s5 = new String("ashish");
		
		
		if(s1 == s2  ) {
			System.out.println("s1 and s2 are same objects");
		}
		else {
			System.out.println("s1 and s2 are diff objects");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 have same content");
		}
		else {
			System.out.println("s1 and s2 have diff content");
		}
		
		if(s3 == s4) {
			System.out.println("s3 and s4 are same objects");
		}
		else {
			System.out.println("s3 and s4 are diff objects");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3 and s4 have same content");
		}
		else {
			System.out.println("s3 and s4 have diff contents");
		}
		
		if(s1 == s5) {
			System.out.println("s1 and s5 are same object");
		}
		else {
			System.out.println("s1 and s5 are not same object");
		}
		if(s1.equals(s5)) {
			System.out.println("s1 and s5 have same content");
		}
		else {
			System.out.println("s1 and s5 have diff content");

		}
		
	}

}
