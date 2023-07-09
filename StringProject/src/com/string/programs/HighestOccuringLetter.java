package com.string.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestOccuringLetter {

	public static void main(String[] args) {
		String s = "sdfadfrerhrhrtehrehtrehtrhrbtbr";
		Map<String, Long> occurence = Arrays.asList(s.split(""))
		.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		occurence.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "::::  " + entry.getValue()));
		
//		Optional.of("Sree")
//		.

	}

}
