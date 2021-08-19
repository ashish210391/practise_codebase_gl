package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomSerializationEmployees {

	static void serializeCustomEmp(FileOutputStream fos, CustomSerializedEmployee emp) throws IOException {

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}

	static void deserializeCustomEmp(FileInputStream fis) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomSerializedEmployee readObject = (CustomSerializedEmployee)ois.readObject();
	
		/*System.out.println("FirstName "+readObject.getFirstName());
		System.out.println("FirstName "+readObject.getFirstName());*/
			//System.out.println("FirstName "+readObject.getManager().getFirstName());
		int id = (Integer)ois.readObject();
		System.out.println("Manager id "+id);

	}

	public static void main(String[] args) {

		Manager manager = new Manager("Gaurav", "Kishore", 2001);
		CustomSerializedEmployee employee = new CustomSerializedEmployee("Ashish", "Kumar", 1001, manager, 40000);

		try {
			FileOutputStream fos = new FileOutputStream("customemp.ser");
			serializeCustomEmp(fos, employee);
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream("customemp.ser");
			deserializeCustomEmp(fis);

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
