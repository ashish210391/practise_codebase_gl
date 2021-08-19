package corejava.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo1 {

	public static void main(String[] args) {

		Map<Person, String> personMap = new HashMap<HashMapDemo1.Person, String>();
		
		Person person1 = new Person("Ashish", "Kumar");
		
		personMap.put(person1, person1.getName());
		
		System.out.println("Before update");
		
		System.out.println("Name === "+personMap.get(person1));
		person1.setFname("ashu");
		
		System.out.println("After update");
		
		System.out.println("Name === "+personMap.get(person1));
		
	}

	private static class Person {

		private String fname;
		private String lname;

		public Person(String fname, String lname) {
			this.setFname(fname);
			this.setLname(lname);
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
		
		public String getName() {
			return this.fname+" "+this.lname;
		}
		
		@Override
		public int hashCode() {
		
			return Objects.hash(this.fname+" "+this.lname);
		}
		


		@Override
		public boolean equals(Object obj) {
			Person person = (Person)obj;
			System.out.println("this.fname == "+this.fname);
			System.out.println("object.fname == "+person.getFname());
			return this.fname.equals(person.getFname()) && this.lname.equals(person.getLname());
		}
		
		
	}
}
