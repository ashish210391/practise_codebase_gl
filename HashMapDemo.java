package corejava.streams;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

		public static void main(String[] args) {
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "Ashish");
			map.put(2, "Kumar");
			map.put(null, null);
			
			String string = map.get(null);
			System.out.println("Null String == "+string);
		}
	
	
}
