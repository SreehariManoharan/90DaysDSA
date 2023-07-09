package com.string.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] inputArray = {"flower", "flow", "a", "flight"};
		
		Comparator<String> lengthComparator = (String s1, String s2) -> {
			return s1.length() - s2.length();
		};
		
		Arrays.sort(inputArray, lengthComparator);
		Arrays.stream(inputArray)
		.forEach(System.out::println);
	}
}
