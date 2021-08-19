package corejava.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class MultipleFieldSorting {

	private static List<Person> sortWithMultipleFields(List<Person> personList) {
		
		Comparator<Person> compare = Comparator.comparing(Person::getFirstName).thenComparing(Person::getAge);
		
		return personList.stream().sorted(compare).collect(Collectors.toList());

	}
	
	private static void print(List<Person> list ) {
		
		list.stream().forEach(person->System.out.println(person.getFirstName()+" "+person.getLastName()));
	}
	
	private static void filterPerson(List<Person> list ) {
		
		List<Person> collect = list.stream().filter(p->p.age>=30).collect(Collectors.toList());
		collect.stream().forEach(person->System.out.println(person.getFirstName()+" "+person.getLastName()));
	}
	
	
	private static MyPredicate getPredicate () {
		return p->p.getAge()>=30;
	}
	
	
	
	
	
	private interface MyPredicate extends Predicate<Person>{
		
		
	}


	public static void main(String[] args) {
		
		Person p1 = new Person("Ashish", "Kumar",30,20000);
		Person p2 = new Person("Sumit", "Bardhan",29,10000);
		Person p3 = new Person("Attish", "Raj",28,5000);
		Person p4 = new Person("Yeshas", "Kumar",32,12000);
		Person p5 = new Person("Vikrant", "Kumar",31,2000);
		
		List<Person> list = new ArrayList<MultipleFieldSorting.Person>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		/*List<Person> sortWithMultipleFields = sortWithMultipleFields(list);
		print(sortWithMultipleFields);*/
		
		filterPerson(list);
	}

	private static class Person {

		private String firstName;
		private String lastName;
		private int age;
		private long salary;

		public Person(String firstName, String lastName, int age, long salary) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.salary = salary;
		}

		public String getFirstName() {
			return this.firstName;
		}

		public String getLastName() {
			return this.lastName;
		}

		public int getAge() {
			return this.age;
		}

		public long getSalary() {
			return this.salary;
		}

	}

}
