package corejava.interfacedemo;

public class FunctionalInterfaceDemoImpl implements FunctionalInterfaceDemo {

	@Override
	public void add(int x, int y) {
		
		System.out.println("Sum"+(x+y));
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemoImpl();
		demo.add(1, 2);
		FunctionalInterfaceDemo.stat_method();
	}
	
	@Override
	public void default_method() {
		System.out.println("this is default_method in Impl class");
	}

}
