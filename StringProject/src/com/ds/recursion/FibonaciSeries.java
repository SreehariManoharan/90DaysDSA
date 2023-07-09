package com.ds.recursion;

public class FibonaciSeries {

	public static void main(String args[]) {
		printFibonacciSeries(8, 0, 1);
	}

	private static void printFibonacciSeries(int i, int first, int second) {
		if ( i >= 0) {
			int sum = first + second;
			System.out.println(sum);
			printFibonacciSeries(--i, second, sum);
			
		}
	}
}
