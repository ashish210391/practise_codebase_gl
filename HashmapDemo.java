package corejava.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {


    public static void main(String[] args) {

        Map<Employee,Integer> map = new HashMap<Employee,Integer>(0);

        Employee e1 = new Employee("Ashish", 1);
        Employee e2 = new Employee("Attish", 2);
        Employee e3 = new Employee("Yeshas", 3);

        map.put(e1, e1.id);
        map.put(e2, e2.id);
        map.put(e3, e3.id);

        System.out.println("Map size == "+map.size());

        System.out.println("Delete Employee from map");
        map.remove(e1);
        System.out.println("Map size after deletion == "+map.size());


        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        System.out.println("Size of hashset ==="+set.size());        
    }

    private static class Employee {

        private String fname;
        private int id ;


        public Employee(String fname, int id) {
            this.fname = fname;
            this.id = id;
        }

        @Override
        public int hashCode() {
            return 420;
        }

    }

}
