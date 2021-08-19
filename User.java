package corejava.serialization;

import java.io.Serializable;

public class User implements Serializable {

	
	private String fname;
	private String lname;
	private int empid;
	
	
	public User() {
		System.out.println("inside constructor");
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
}
