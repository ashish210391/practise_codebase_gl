package corejava.serialization;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChildUser extends User {

	public ChildUser() {
		System.out.println("inside childuser constructor");
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {

		/*oos.defaultWriteObject();
		System.out.println("inside custom writeObject()");*/
		throw new NotSerializableException("Class is not serializable");

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		/*ois.defaultReadObject();
		System.out.println("inside custom readObject()");*/
		throw new NotSerializableException("Class is not serializable");
	}

}
