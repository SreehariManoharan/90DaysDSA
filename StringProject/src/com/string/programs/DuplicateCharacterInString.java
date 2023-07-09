package com.string.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String s = "Malayalam";
		String[] sArray = s.split("");
		Map<String, Long> occurenceMap = Arrays.stream(sArray)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Set<Entry<String, Long>> entrySet = occurenceMap.entrySet();
		
		Predicate<? super Entry<String, Long>> testPredicate = (entry) -> entry.getValue() > 1;
		
		entrySet.stream()
		.filter(eachEntry -> testPredicate.test(eachEntry))
		.forEach(filteredEntry -> System.out.println(" key " + filteredEntry.getKey() + " Value " + filteredEntry.getValue()));
		
		Collector<Object, ?, Map<Object, Long>> variableAfterGrouping = Collectors.groupingBy(Function.identity(), Collectors.counting());
		
		

	}

}
