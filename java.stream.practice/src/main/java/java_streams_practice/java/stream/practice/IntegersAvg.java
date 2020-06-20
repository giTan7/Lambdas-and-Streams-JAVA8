package java_streams_practice.java.stream.practice;

import java.util.ArrayList;
import java.util.List;

public class IntegersAvg {
	public static double getintegersAverage() {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(5);
		integerList.add(10);
		integerList.add(50);
		return integerList.stream().mapToInt(e -> e).average().orElse(0);
	}

}
