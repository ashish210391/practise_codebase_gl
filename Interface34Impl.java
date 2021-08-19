package corejava.interfacedemo;

public class Interface34Impl implements InterfaceDemo3,InterfaceDemo4{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int x, int y) {
		InterfaceDemo4.super.add(x, y);
		System.out.println("inside add() of Interface34Impl ");
	}
	
	public static void main(String[] args) {
		Interface34Impl imp = new Interface34Impl();
		imp.add(1, 2);
	}

	
}
