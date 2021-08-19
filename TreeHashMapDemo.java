package corejava.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeHashMapDemo {

	
	
	private static void addToTreeMap() {
		
		Comparator<String > comparator = Comparator.comparing((String::length),(e1,e2)->e2.compareTo(e1));
		Map<String,String > treeMap = new TreeMap<>(comparator);
		
		treeMap.put("a", "a");
		treeMap.put("ab", "ab");
		treeMap.put("abc", "abc");
		
		Iterator<Entry<String, String>> iterator = treeMap.entrySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getValue());
		}
			
	}
	
	public static void main(String[] args) {	
	
		addToTreeMap();
	}
}
