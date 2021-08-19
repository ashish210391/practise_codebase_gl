package corejava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo1 {

	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Banana","Orange","apple");
		
		System.out.println(list.size());
		
		List<String> resultList = new ArrayList<String>();
		list.stream().filter(e->e.length()>5).map(e->resultList.add(e));
		
		System.out.println("length of result list == "+resultList);
	}
}
