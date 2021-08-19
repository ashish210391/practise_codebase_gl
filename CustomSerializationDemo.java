package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerializationDemo {

	public static void serializeObject(User user) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:/childuser.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
	}

	public static void deserializeObject() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:/childuser.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User user = (User) ois.readObject();
		System.out.println("User name is " + user.getFname() + " " + user.getLname());
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		User user = new ChildUser();
		user.setFname("mickey");
		user.setLname("mouse");
		user.setEmpid(1001);

		serializeObject(user);
		deserializeObject();

	}

}
