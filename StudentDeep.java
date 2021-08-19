package clone;

public class StudentDeep implements Cloneable {

	private String name;
	private String roll;
	private Address address;

	public StudentDeep(String name, String roll, Address address) {
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
		StudentDeep clone = (StudentDeep) super.clone();
		Address cloneAddress = (Address) clone.getAddress().clone();
		clone.setAddress(cloneAddress);
		return clone;
	}

}
