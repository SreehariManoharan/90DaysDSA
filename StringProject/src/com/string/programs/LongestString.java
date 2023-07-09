package com.string.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestString {

	public static void main(String[] args) {
	
		String[] values = {"Sreehari", "Sreerekha", "Vishnu", "Arun", "Sreelakshmi"};
		Function<String, String> keyMapper = (name) -> name;
		Function<String, Integer> valueMapper = (name) -> name.length();
		int asInt = Arrays.stream(values)
		.collect(Collectors.toMap(keyMapper, valueMapper))
		.entrySet()
		.stream()
		.mapToInt(eachEntry -> eachEntry.getValue())
		.max()
		.getAsInt();	
		System.out.println(asInt);
		
		Optional<String> maxLength = Arrays.stream(values)
        .reduce((word1, word2)
  -> word1.length() > word2.length()
                ? word1 : word2);
		maxLength.get();
		System.out.println(" Max length " + maxLength.get());

	}

}
