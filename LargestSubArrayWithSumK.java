package corejava.algo;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumK {

	public static int lengthOfLargestSubarray(int ar[], int k) {

		int len = ar.length;

		Map<Integer, Integer> prefixMap = new HashMap<>();
		int maxLen = 0;
		int sum = 0;

		for (int i = 0; i < len; i++) {

			sum += ar[i];
			if (sum == k) {
				maxLen = i + 1;
			}

			if (!prefixMap.containsKey(sum)) {
				prefixMap.put(sum, i);
			}

			if (prefixMap.containsKey(sum - k)) {
				maxLen = Math.max(maxLen, i - prefixMap.get(sum - k));
			}

		}

		return maxLen;
	}

	public static void main(String[] args) {

		/*
		 * int ar[]= {6,8,14,9,4,11,10}; int k=13;
		 */
		/*
		 * int ar[]= {2,3,4,2,1,1}; int k=10;
		 */

		/*
		 * int ar[]= {2}; int k=2;
		 */

		/*
		 * int ar[]= {3,4,7,2,-3,1,4,2}; int k=7;
		 */

		int ar[] = { 3, 4, 7, 2, -3, 1, 4, 2 };
		int k = 0;
		int length = lengthOfLargestSubarray(ar, k);

		System.out.println("Length of largest subarray == " + length);
	}
}
