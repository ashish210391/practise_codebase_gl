package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeesSerialization {

	public void addEmployeesToList() throws IOException {

		List<Employee> list = new ArrayList<Employee>();
		Manager manager = new Manager("Gaurav", "Kishore", 2001);
		Employee employee = new Employee("Ashish", "Kumar", 1001, manager, 40000);
		Employee employe2 = new Employee("sital", "Kumar", 1002, manager, 50000);
		Employee employee3 = new Employee("Ankit", "Aggarwal", 1003, manager, 80000);
		list.add(employee);
		list.add(employe2);
		list.add(employee3);

		serializeEmployee(list);

	}

	public void serializeEmployee(List<Employee> list) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:/employees.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		list.stream().forEach(employee -> {
			try {
				oos.writeObject(employee);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

	}

	public void deserializeEmployee() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:/employees.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Employee> resultantList = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			Employee emp = (Employee) ois.readObject();
			resultantList.add(emp);
			System.out.println(emp.getManager().hashCode());
		}


	}

	public static void main(String[] args) {

		EmployeesSerialization ser = new EmployeesSerialization();
		try {
			ser.addEmployeesToList();
			ser.deserializeEmployee();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
