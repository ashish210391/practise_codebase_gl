package test;

import java.util.ArrayList;
import java.util.List;

public class TestEqualAndHashCodeInList {

	
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee("Ashish", "1001");
		list.add(emp1);
		Employee emp2 = new Employee("Ashish kumar", "1002");
		list.add(emp2);
		Employee emp3 = new Employee("Ashu", "1003");
		list.add(emp3);
		
			//calls the equals method 
		//list.remove(emp1);
		
		list.contains(emp3);
		
		System.out.println("Size of list = "+list.size());
		
	}
	
	
	private static class Employee{
		
		private String name;
		private String id;

		public Employee(String name, String id) {
			this.name = name;
			this.id = id;
		}
		
		@Override
		public boolean equals(Object obj) {
			System.out.println("Inside equals");
			return super.equals(obj);
		}
		
		@Override
		public int hashCode() {
			System.out.println("inside hashcode");
			return super.hashCode();
		}
		
	}
}
