package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DuplicateObjectsWithSerialization {

	private List<Employee> list;

	public DuplicateObjectsWithSerialization() {
		list = new ArrayList<Employee>();
	}

	private void addEmployeetoList(Employee e) {
		list.add(e);
	}

	private void serializeEmployeeObj(Employee employee, String fileName) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:/" + fileName);	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);
		oos.close();
		fos.close();
	}

	
	private void serializeEmployeeObj1() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/" + "testser");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list.get(0));
		oos.writeObject(list.get(1));
		
	}
	
	private void deserializeEmployeeObj1() throws  ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("D:/" + "testser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee readObject1 = (Employee) ois.readObject();
		Employee readobject2= (Employee) ois.readObject();
		System.out.println("employee "+readObject1.getFirstName());
		System.out.println("employee "+readobject2.getFirstName());
		
		
		if(readObject1.getManager() == readobject2.getManager()) {
			System.out.println("Same manager");
		}
		else {
			System.out.println("diff manager");
		}
		
	}
		private Employee deserializeEmployeeObj(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:/" + fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee readObject = (Employee) ois.readObject();
		return readObject;
	}

	public static void main(String[] args) {
		Employee emp1 = null;
		Employee emp2 = null;
		Manager manager = new Manager("Gaurav", "Kishore", 2001);
		Employee employee = new Employee("Ashish", "Kumar", 1001, manager, 40000);

		Employee employe2 = new Employee("sital", "Kumar", 1002, manager, 50000);

		System.out.println(employee.getManager().hashCode());
		System.out.println(employe2.getManager().hashCode());

		DuplicateObjectsWithSerialization dup = new DuplicateObjectsWithSerialization();
		dup.addEmployeetoList(employee);
		dup.addEmployeetoList(employe2);
		/*try {
			dup.serializeEmployeeObj(employee, "seremployee1");
			dup.serializeEmployeeObj(employe2, "seremployee2");
			emp1 = dup.deserializeEmployeeObj("seremployee1");
			emp2 = dup.deserializeEmployeeObj("seremployee2");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		
		try {
			dup.serializeEmployeeObj1();
			dup.deserializeEmployeeObj1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	/*	System.out.println(emp1.getManager().hashCode());
		System.out.println(emp2.getManager().hashCode());
*/
		/*
		 * if (emp1.getManager() == emp2.getManager()) {
		 * System.out.println("Both are having same manager object"); } else {
		 * System.out.println("Both are having different manager object"); }
		 */
	}

}
