package corejava.serialization;

import java.io.Serializable;

public class SerializationDemo implements Serializable,Department {

	private String firstName;
	private String middleName;
	private String lastName;
	private String departName;
	private int deptno;
	private transient double salary;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getEmpid() {
		return empid;
	}

	private int empid;

	public SerializationDemo() {
	}

	public SerializationDemo(String fname, String mname, String lname, int empid) {
		firstName = fname;
		middleName = mname;
		lastName = lname;
		this.empid = empid;

	}

	@Override
	public int getDeptNumber() {
		return this.deptno;
	}

	@Override
	public String getDepartmentName() {
		return this.departName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
