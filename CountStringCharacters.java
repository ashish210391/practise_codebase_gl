package corejava.streams;

public class CountStringCharacters {

	private static void countCharacters(String str, char character) {

		long count = str.chars().filter(c -> c == character).count();
		System.out.println("count of " + character + " = " + count);

	}

	public static void main(String[] args) {

		String str = "my name is ashish";

		countCharacters(str, 's');
	}

}
