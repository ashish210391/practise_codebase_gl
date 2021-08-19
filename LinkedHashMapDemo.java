package corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	private static void addToLinkedHashMap() {

		Map<String, String> map = new LinkedHashMap<>();

		map.put("Ashish", "Ashish");
		map.put("Sumit", "Sumit");
		map.put("Navaneet", "Navaneet");

		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getValue());
		}

		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Ashish", "Ashish");
		hashMap.put("Sumit", "Sumit");
		hashMap.put("Navaneet", "Navaneet");
		
		Iterator<Entry<String, String>> iterator2 = hashMap.entrySet().iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next().getValue());
		}
		
	}
	
	private static void deleteFromLinkedHashMap() {
		Map<String, String> map = new LinkedHashMap<>();

		map.put("Ashish", "Ashish");
		map.put("Sumit", "Sumit");
		map.put("Navaneet", "Navaneet");
		
		
		// when removing the element it throws concurrent modification exception
		/*for(String s : keySet) {
			
			keySet.remove(s);
		}*/
		
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
	
		System.out.println("size of map is "+map.size());
		
	}
	

	public static void main(String[] args) {

		//addToLinkedHashMap();
		deleteFromLinkedHashMap();
		
	}

}
