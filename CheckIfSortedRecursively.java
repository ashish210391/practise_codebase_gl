package corejava.algo;

public class CheckIfSortedRecursively {

	public static boolean sort(int ar[], int i) {

		if(i==ar.length-1)
			return true;

		boolean isSorted = false;
		if (ar[i] <= ar[i + 1])
			isSorted = sort(ar, i + 1);

		return isSorted;

	}

	public static void main(String[] args) {

		int ar[] = { 1,2,4,3};
		boolean sort = sort(ar, 0);
		System.out.println("result " + sort);

	}

}
