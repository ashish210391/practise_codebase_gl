package coreconcepts.demo;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemoChild extends GenericsDemo{
	
	
	@Override
	public void add(List list) {
		
		System.out.println("inside child add()");
		list.add(1);
		System.out.println("List size == "+list.size());
	}
    
	
	
	public static void main(String[] args) {
		
		GenericsDemoChild child = new GenericsDemoChild();
		child.add(new ArrayList<Integer>());
	}

}
