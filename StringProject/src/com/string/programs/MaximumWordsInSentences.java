package com.string.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaximumWordsInSentences {

	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
	
		Integer maximumLength = Arrays.asList(sentences)
		.stream()
		.map(eachSentences -> eachSentences.split(" ").length)
		.sorted(Comparator.reverseOrder())
		.findFirst()
		.get();
		
		System.out.println(maximumLength);

	}

}
