package corejava.serialization;

public class Address {

	private String flatNumber;
	private String apartmentName;
	private String street;
	private String city;
	private String state;
	private long zipcode;

	public Address(String flatNumber, String apartmentName, String street, String city, String state, long zipcode) {
		this.flatNumber = flatNumber;
		this.apartmentName = apartmentName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

}
