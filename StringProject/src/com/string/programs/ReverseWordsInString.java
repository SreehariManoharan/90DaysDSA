package com.string.programs;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "Ich liebe Deutschland";
		BinaryOperator<StringBuilder> joinStringsAccumulator = (StringBuilder firstString, StringBuilder secondString) -> {
			return firstString.append(" ").append(secondString);
		};
		StringBuilder resultStringBuilder = Arrays.asList(s.split(" "))
		.stream()
		.map(eachWordInString -> new StringBuilder(eachWordInString).reverse())
		.reduce(joinStringsAccumulator)
		.get();
		System.out.println(resultStringBuilder.toString());

	}

}
