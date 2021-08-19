package corejava.streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsToCollectionDemo {

	static void modifyToCollection(List<Employee> empList) {

		LinkedList<Employee> collect = empList.stream().collect(Collectors.toCollection(LinkedList::new));

		HashSet<Employee> set = empList.stream().collect(Collectors.toCollection(HashSet::new));

		collect.forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

		set.stream().forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

	}
	
	

	public static void main(String[] args) {
		Employee emp1 = new Employee("Ashish", "Kumar", 1, 10000);
		Employee emp2 = new Employee("Sumit", "Bardhan", 2, 20000);
		Employee emp3 = new Employee("Vipul", "Singh", 3, 40000);
		Employee emp4 = new Employee("Prateek", "Narayan", 4, 30000);
		Employee emp5 = new Employee("Navaneet", "Kumar", 5, 25000);

		List<Employee> empList = new LinkedList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		modifyToCollection(empList);

	}

	private static class Employee {
		private String firstName;
		private String lastName;
		private int eid;

		private long salary;

		public Employee(String firstName, String lastName, int eid, long salary) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.eid = eid;
			this.salary = salary;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getEid() {
			return eid;
		}

		public long getSalary() {
			return salary;
		}

	}

}
