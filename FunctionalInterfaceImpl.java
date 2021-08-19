package corejava.interfacedemo;

public class FunctionalInterfaceImpl implements InvalidFunctionalInterface {

	@Override
	public void sub(int x, int y) {
		int diff = y - x;
		System.out.println("Difference = " + diff);

	}

	@Override
	public void mul(int x, int y) {
		int product = x * y;
		System.out.println("product of numbers in child is : " + product);
	}

	public void calculateProduct(int a, int b) {
		InvalidFunctionalInterface.super.mul(10, 10);
	}

	public static void main(String[] args) {

		InvalidFunctionalInterface func = new FunctionalInterfaceImpl();
		func.sub(10, 15);
		func.mul(12, 10);
		InvalidFunctionalInterface.add(10, 17);
		((FunctionalInterfaceImpl) func).calculateProduct(12, 12);
	}

}
