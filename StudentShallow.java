package clone;

public class StudentShallow implements Cloneable {

	private String name;
	private String roll;
	private Address address;

	public StudentShallow(String name, String roll, Address address) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
