package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializatonDemo1 {

	private List<Employee> list;

	public EmployeeSerializatonDemo1() {
		this.list = new ArrayList<Employee>();
	}

	public void addEmployee() {
		Employee e1 = new Employee("ashish", "kumar", 1001, null, 40000);
		list.add(e1);
		Employee e2 = new Employee("Vikrant", "Kumar", 1002, null, 30000);
		list.add(e2);
		Employee e3 = new Employee("Attish", "Raj", 1001, null, 34000);
		list.add(e3);

	}

	public void startSerialization() throws IOException {
		for (Employee e : list) {
			serializeEmpObject(e);
		}
	}

	public void serializeEmpObject(Employee employee) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/emp1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);
		oos.close();
		fos.close();
	}
	
	public void deserializeEmpObject() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:/emp1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Employee> dem = (List<Employee>) ois.readObject();
		System.out.println(dem.get(0).getFirstName());
	}

	public static void main(String[] args) {

		EmployeeSerializatonDemo1 demo = new EmployeeSerializatonDemo1();
		demo.addEmployee();
		try {
			demo.startSerialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			demo.deserializeEmpObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
