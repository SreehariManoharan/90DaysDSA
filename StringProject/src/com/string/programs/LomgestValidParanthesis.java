package com.string.programs;

import java.util.Arrays;
import java.util.Stack;

public class LomgestValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paranthesisString = "))()()((";
		int leftIndex = 0;
		int rightIndex = paranthesisString.length() - 1;
		int leftParanthesisCount = 0;
		int rightParanthesisCount = 0;
		fetchValidParanthesis(paranthesisString.toCharArray(), leftIndex, rightIndex, leftParanthesisCount, rightParanthesisCount);
		
	}

	private static void fetchValidParanthesis(char[] paranthesisString, int leftIndex, int rightIndex, int leftParanthesisCount, int rightParanthesisCount) {
		Stack<Character> paranthesisStack = new Stack<>();
		int validParanthesisCount = 0;
		
		for(int i =0; i< paranthesisString.length; i++) {
			if (paranthesisString[i] == '(')
				paranthesisStack.push(paranthesisString[i]);
			else if (paranthesisString[i] == ')' && !paranthesisStack.empty()) {
				paranthesisStack.pop();
				validParanthesisCount = validParanthesisCount + 2;
			}
		}
		System.out.println("Valid paranthesis count " + validParanthesisCount);
	}

}
