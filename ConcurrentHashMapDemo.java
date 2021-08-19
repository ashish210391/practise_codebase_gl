package corejava.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	private Map<Integer, String> conHashMap;

	public ConcurrentHashMapDemo() {
		conHashMap = new ConcurrentHashMap<>();
	}

	private void populateHashMap() {
		conHashMap.put(1, "Ashish");
		conHashMap.put(2, "Sumit");
		conHashMap.put(3, "Navaneet");
		conHashMap.put(null, "null");

	}
	
	private void getHashMapVal() {
		System.out.println(conHashMap.get(null));
	}

	public static void main(String[] args) {

		ConcurrentHashMapDemo demo = new ConcurrentHashMapDemo();
		demo.populateHashMap();
		demo.getHashMapVal();
	}

}
