package corejava.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	private Set<Integer> set ;
	
	public SetDemo() {
		set = new TreeSet<>();
	}
	
	
	public void populateSet() {
		
		set.add(12);
		set.add(1);
		set.add(13);
		set.add(10);
		set.add(1);
	}
	
	public void printSetElements() {
		set.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		SetDemo demo = new SetDemo();
		demo.populateSet();
		demo.printSetElements();
		
	}

}
