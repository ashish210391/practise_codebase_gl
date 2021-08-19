package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void serializeObject(SerializationDemo demo) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:/emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo);
		oos.close();
		fos.close();
	}

	public static void deserializeObject() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:/emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationDemo dem = (SerializationDemo) ois.readObject();
		System.out.println("name === " + dem.getFirstName() + " " + dem.getMiddleName() + " " + dem.getLastName());
		System.out.println("department name === "+dem.getDepartmentName()+" department number === "+dem.getDeptNumber());
		System.out.println("salary == "+dem.getSalary());
	}

	public static void main(String[] args) {

		SerializationDemo emp1 = new SerializationDemo("ashish", "kumar", "sinha", 101);
		emp1.setDepartName("Google clouds");
		emp1.setDeptno(10001);
		emp1.setSalary(20000);
	
		
		try {
			 serializeObject(emp1);
			deserializeObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
