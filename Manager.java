package corejava.serialization;

import java.io.Serializable;

public class Manager{

	private String firstName;
	private String lasName;
	private int managerId;
	
	

	public Manager(String firstName, String lasName, int managerId) {
		this.firstName = firstName;
		this.lasName = lasName;
		this.managerId = managerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
