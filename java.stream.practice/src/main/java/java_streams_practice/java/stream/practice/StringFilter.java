package java_streams_practice.java.stream.practice;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	
	public static List<String> getFilteredList(List<String> listOfStrings){
		return listOfStrings.stream().filter(e -> e.startsWith("a"))
				.filter(e -> (e.length() == 3))
				.collect(Collectors.toList());
	}

}
