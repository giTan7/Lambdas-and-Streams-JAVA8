package java_streams_practice.java.stream.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeFilter {
	
	public static List<String> getPalindromList(List<String> listOfStrings){
		
		PalindromFunctionalInterface obj = (String str) -> {
			return IntStream.range(0, str.length()/2)
			.noneMatch(i -> str.charAt(i) != str.charAt(str.length()-i-1));
		};
		return listOfStrings.stream()
				.filter(obj::checkPalindrom)
				.collect(Collectors.toList());
	}
}

