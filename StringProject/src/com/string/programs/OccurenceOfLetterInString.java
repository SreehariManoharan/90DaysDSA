/**
 * 
 */
package com.string.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author sreeharimanoharan
 *
 */
public class OccurenceOfLetterInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "I Love Sree";
		String[] sArray = s.split("");
		Map<String, Long> collect = Arrays.stream(sArray)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}

}
