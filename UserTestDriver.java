package corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTestDriver {

	private static void serializeUserObject(User user) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:/user.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(user);
		System.out.println("serialization is done");

	}

	private static void deserializeUserObject() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:/user.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User user = (User)ois.readObject();
		
		System.out.println("user name == "+user.getFname()+" "+user.getLname());
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*User user = new User();
		user.setFname("Ashish");
		user.setLname("kumar");
		user.setEmpid(1001);*/
		//serializeUserObject(user);
		deserializeUserObject();
		
		
	}

}
