package com.string.programs;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ValidateTwoStringArrays {

	public static void main(String[] args) {
		String[] word1 = {"jbboxe","yshcrtanrtlzyyp","vudsssnzuef","lde"};
		String[] word2 = {"jbboxeyshcrtanrt","lzyypvudsssnzueflde"};
		
		BinaryOperator<String> joinStringsAccumulator = (String a, String b) -> {
			return a.concat(b);
			
		};
		String concatedString1 = Arrays.asList(word1)
		.stream()
		.reduce(joinStringsAccumulator )
		.get();
		
		String concatedString2 = Arrays.asList(word2)
				.stream()
				.reduce(joinStringsAccumulator)
				.get();
		
		System.out.println(concatedString1);
		System.out.println(concatedString2);
		

	}

}
