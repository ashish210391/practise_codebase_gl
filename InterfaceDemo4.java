package corejava.interfacedemo;

public interface InterfaceDemo4 {
	
	public void add();
	default void add(int x,int y) {
		System.out.println("Inside add() of InterfaceDemo4");
	}

}
