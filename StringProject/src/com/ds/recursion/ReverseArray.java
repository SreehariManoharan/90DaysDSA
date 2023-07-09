package com.ds.recursion;

import java.util.Arrays;
/**
 * Some comments are added to test the commit.
 * @author sreeharimanoharan
 *
 */
public class ReverseArray {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 5, 6};
		int result[] = reverseArray(a, 0, a.length -1);
		
		for (int element: result) {
			System.out.println(element);
		}
	}

	private static int[] reverseArray(int[] a, int start, int end) {
		if (start > end) {
			return a;
		}
		int temp = 0;
		temp = a[end];
		a[end] = a[start];
		a[start] = temp;
		
		return reverseArray(a, start + 1, end -1);
	}

}
