package corejava.streams;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEmployeeBasedOnSalary {

	public static Employee getEmpWithMaxSal(List<Employee> emp) {

		Optional<Employee> collect = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		return collect.get();
	}

	public static long getAvgSalOfEmployees(List<Employee> emp) {
		return emp.stream().collect(Collectors.averagingLong(Employee::getSalary)).longValue();
	}

	public static Employee getEmpWithMinSalary(List<Employee> emp) {

		return emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get();
	}
	
	public static long getEmpWithSecondHighestSalary(List<Employee> list) {
		
		Optional<Employee> maxSal = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		Employee employee = list.stream().filter(emp->emp.getSalary()!= maxSal.get().getSalary()).collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
		
		return employee.getSalary();
	}

	public static void groupEmpWithLastName(List<Employee> emp) {

		Map<String, List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(Employee::getLastName));

		for (Map.Entry<String, List<Employee>> entry : collect.entrySet()) {
			System.out.print(entry.getKey() + "---->");
			entry.getValue().stream().forEach(e -> System.out.println(e.getFirstName()));
		}
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

		Employee empWithMaxSal = getEmpWithMaxSal(empList);
		System.out.println(
				"Employee with max salary == " + empWithMaxSal.getFirstName() + " " + empWithMaxSal.getLastName());

		long avgSal = getAvgSalOfEmployees(empList);
		System.out.println("Average Salary == " + avgSal);

		Employee empWithMinSal = getEmpWithMinSalary(empList);

		System.out.println(
				"Employee with min salary == " + empWithMinSal.getFirstName() + " " + empWithMinSal.getLastName());

		groupEmpWithLastName(empList);
		
		System.out.println("Employee with second highest salary === "+getEmpWithSecondHighestSalary(empList));
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
