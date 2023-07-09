package com.string.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] numberArray = {12,34, 23, 22, 21, 43, 35};
		Integer integer = Arrays.stream(numberArray)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();		

	}

}
