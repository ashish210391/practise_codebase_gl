package corejava.algo;

import java.util.HashSet;
import java.util.Set;

public class PrintAllPermOfString {

	static void printPerm(String str, String perm) {

		if (str.length() == 0) {
			System.out.println(perm);
			return;
		}
		
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!set.contains(ch))
			{
			String remStr = str.substring(0, i) + str.substring(i + 1);
			set.add(ch);
			printPerm(remStr, perm + ch);
			}
			
		}

	}

	public static void main(String[] args) {

		printPerm("ABC", "");

	}
}
