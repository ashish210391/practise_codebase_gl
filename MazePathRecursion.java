package corejava.algo;

public class MazePathRecursion {

	private static int totalPath = 0;

	static void mazePath(int row, int col, int i, int j, String osf) {

		if (i == row - 1 && j == col - 1) {
			totalPath++;
			System.out.println(osf);
			return;
		}
		if (i >= row || j >= col)
			return;

		mazePath(row, col, i, j + 1, osf + "R");
		mazePath(row, col, i + 1, j, osf + "D");

	}

	public static void main(String[] args) {

		mazePath(3, 3, 0, 0, "");
		System.out.println("Total paths == " + totalPath);

	}
}
