package corejava.streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamDemo {

	public static void calAverage() {

		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		OptionalDouble averageoptional = intStream.average();
		double average = averageoptional.getAsDouble();
		System.out.println("Average = " + average);
	}

	public static void convertStreamToList() {
		Stream<String> stringStream = Stream.of("ashish", "sumit", "navaneet");

		List<String> collect = stringStream.collect(Collectors.toList());
		System.out.println("Size of string list = " + collect.size());
	}

	public static void main(String[] args) {
		calAverage();
		convertStreamToList();	
	}

}
