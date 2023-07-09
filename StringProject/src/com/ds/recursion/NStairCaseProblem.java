package com.ds.recursion;

public class NStairCaseProblem {

	public static void main(String[] args) {
		System.out.println(calculateSteps(6));
	}

	private static int calculateSteps(int n) {
		//Base case 
		if (n == 1 || n== 2) {
			return n;
		}
		int recall1 = calculateSteps(n - 1);
		int recall2 = calculateSteps(n - 2);
		int smallCalc = recall1 + recall2;
		return smallCalc;
		
	}

}
