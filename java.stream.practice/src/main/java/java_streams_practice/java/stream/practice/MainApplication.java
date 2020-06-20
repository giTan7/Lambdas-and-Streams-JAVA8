package java_streams_practice.java.stream.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * EPAM JAVA Stream Task
 ** @author Tarannum Ara
 *
 */
public class MainApplication {
	public static void main(String[] args) {

		// 1. Write a method that returns the average of a list of integers.
		double integer_Avg = IntegersAvg.getintegersAverage();
		System.out.println("Average of Integers : " + integer_Avg);

		// 2. write a method that returns a list of all strings that start with the
		// letter 'a' (lower case) and have exactly 3 letters
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("ana");listOfStrings.add("animal");
		listOfStrings.add("cow");listOfStrings.add("panda");
		listOfStrings.add("alp");listOfStrings.add("alla");
		listOfStrings.add("ask");listOfStrings.add("act");
		listOfStrings.add("app");listOfStrings.add("aka");

		List<String> filteredList = StringFilter.getFilteredList(listOfStrings);
		System.out.print("\nFiltered List : ");
		System.out.println(filteredList);

		// 3. write a method that returns a list of all the palindrome strings.
		List<String> palindromsList = PalindromeFilter.getPalindromList(listOfStrings);
		System.out.print("\nPalindrom List : ");
		System.out.println(palindromsList);
	}
}
