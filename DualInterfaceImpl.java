package corejava.streams;

import corejava.interfacedemo.InterfaceDemo1;
import corejava.interfacedemo.InterfaceDemo2;

public class DualInterfaceImpl implements InterfaceDemo1,InterfaceDemo2 {

	@Override
	public void add(int x, int y) {
		System.out.println("sum =  "+(x+y));
	}

	public static void main(String[] args) {
		InterfaceDemo1 demo1 = new DualInterfaceImpl();
		demo1.add(1, 2);
		InterfaceDemo2 demo2 = new DualInterfaceImpl();
		demo2.add(3, 4);
	}
}
