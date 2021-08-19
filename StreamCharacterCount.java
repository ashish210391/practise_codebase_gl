package corejava.streams;

public class StreamCharacterCount {

	public static void countChar(String str, char ch) {

		long count = str.chars().filter(c -> c == ch).count();
		System.out.println("Count of " + ch + "in " + str + " = " + count);
	}

	public static void main(String[] args) {
		
		countChar("geeksforgeeks", 's');
	}
}
