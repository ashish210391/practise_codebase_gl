package corejava.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	protected String firstName;
	protected String lastName;
	protected transient Manager manager;
	protected long salary;
	protected int id;

	public Employee(String firstName, String lastName, int employeeid, Manager manager, long salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setManager(manager);
		this.id = employeeid;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return this.id;
	}

	public void setManagerId(int employeeid) {
		this.id = employeeid;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
