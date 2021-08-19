package corejava.algo;

import java.util.Arrays;

public class InsertionSort {

	private static void sort(int ar[]) {
		int len = ar.length;

		for (int i = 1; i < len; i++) {
			int k = i;
			while (k > 0) {
				if (ar[k] < ar[k - 1]) {
					int temp = ar[k];
					ar[k] = ar[k - 1];
					ar[k - 1] = temp;
					k--;
				} else {
					break;
				}
			}

		}
	}

	private static void print(int ar[]) {
		Arrays.stream(ar).forEach(System.out::println);
	}

	public static void main(String[] args) {
	//	int ar[] = { 2, 4, 6, 1, 10 };
		int ar[]= {4,3,2,10,12,1,5,6};
		sort(ar);
		print(ar);
	}

}
