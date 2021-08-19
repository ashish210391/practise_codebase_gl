package corejava.interfacedemo;

public interface InvalidFunctionalInterface {

	static void add(int x, int y) {
		int sum = x + y;
		System.out.println("sum= " + sum);
	}

	default void mul(int x, int y) {
		int product = x * y;
		System.out.println("product= " + product);
	}

	public void sub(int x, int y);

}
