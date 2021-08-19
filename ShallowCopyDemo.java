package clone;

public class ShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("101", "Himadari", "South office para");
		StudentShallow student = new StudentShallow("Ashish", "1001", address);

		StudentShallow studentClone = (StudentShallow) student.clone();
		System.out.println("student name = " + studentClone.getName());
		System.out.println("Student apartment name is original = " + student.getAddress().getApartmentName());

		studentClone.getAddress().setApartmentName("nest");

		System.out.println("after updating the address of the student in the cloned object");

		System.out.println("Student address in the cloned object = " + studentClone.getAddress().getApartmentName());
		System.out.println("Student address in the original object = " + student.getAddress().getApartmentName());
	}

}
