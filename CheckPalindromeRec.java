package corejava.algo;

public class CheckPalindromeRec {

	static boolean isPalindorme(String str, int start, int end) {

		if (start > end)
			return false;
		if (start == end)
			return true;
		boolean isPal = false;
		if (str.charAt(start) == str.charAt(end))
			isPal = isPalindorme(str, ++start, --end);
		return isPal;
	}
	
	
	public static void main(String[] args) {
		if(isPalindorme("1", 0, 0))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
