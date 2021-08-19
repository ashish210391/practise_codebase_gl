package corejava.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerializedEmployee extends Employee {

	public CustomSerializedEmployee(String firstName, String lastName, int employeeid, Manager manager, long salary) {
		super(firstName, lastName, employeeid, manager, salary);
	}

	private  void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(manager.getManagerId());
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {

		ois.defaultReadObject();
//		String firstName = (Integer) ois.readObject();
//		String lastName = (String) ois.readObject();
//
//		System.out.println("First Name " + firstName);
//		System.out.println("Last Name " + lastName);

		int managerId = (Integer)ois.readObject();
		System.out.println("Manager Id "+managerId);
	}

}
