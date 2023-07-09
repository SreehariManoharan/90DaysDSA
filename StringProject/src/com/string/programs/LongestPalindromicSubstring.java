package com.string.programs;


public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String str ="bb";
		String[] splittedStr = str.split("");
		String longestPalindromicSubstring = splittedStr[0];
		for (int i =0; i<splittedStr.length-1; i++) {
			for (int j = i + 1; j <= splittedStr.length; j++) {
				String toBecheckedString = splittedStr[i].concat(str.substring(i + 1, j));
				if (isPalindrome(toBecheckedString)) {
					if (longestPalindromicSubstring.length() < toBecheckedString.length())
						longestPalindromicSubstring = toBecheckedString;
				}
			}
		}
		System.out.println("The longest palindromic substring is " + longestPalindromicSubstring);
	}
	static boolean isPalindrome(String originalString) {
		StringBuilder originalStringBuffer = new StringBuilder();
		originalStringBuffer.append(originalString);
		StringBuilder reverseStringBuffer = new StringBuilder();
		reverseStringBuffer.append(originalString);
		return  originalStringBuffer.compareTo(reverseStringBuffer.reverse()) == 0;
	}
	
		
}
