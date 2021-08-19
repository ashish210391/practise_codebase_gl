package corejava.interfacedemo;

 public interface FunctionalInterfaceDemo {
	
	public void add(int x,int y);
	public static void stat_method() {
		System.out.println("This is stat method");
	}
	
	default void default_method() {
		System.out.println("this is default method");
	}
}
