package test;
import java.util.ArrayList;
import java.util.List;

public class EvenOddNumber {
	
	static  volatile int sharedVal = 0;
	
	public static void main(String[] args) {
		
		Object lock = new Object();
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		EvenNumber even  = new EvenNumber(sharedVal, lock,list);
		OddNumber odd = new OddNumber(sharedVal, lock,list);
		
		Thread evenThread = new Thread(even);
		Thread oddThread = new Thread(odd);
		
		evenThread.start();
		oddThread.start();
		
		
	}
	
	
	
	
	
	
	
}
