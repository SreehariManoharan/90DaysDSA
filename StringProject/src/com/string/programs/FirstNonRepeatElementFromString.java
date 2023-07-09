package com.string.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElementFromString {

	public static void main(String[] args) {
	
		String s = "mynameissreehari";
		Entry<String, Long> entry = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(eachEntry -> eachEntry.getValue() == 1)
		.findFirst()
		.get();
		/**
		 * Here we are using the hash map which doesn't give the result as expected, as it doesn't preserve the insertion order
		 * We have to use the linked Hash map to preserve the insertion order.
		 * Finally Linked hash map is used to preserve the insertion order
		 * 
		 */
		System.out.println(" The first non repeat element from the string is " + entry.getKey());
		

	}

}
