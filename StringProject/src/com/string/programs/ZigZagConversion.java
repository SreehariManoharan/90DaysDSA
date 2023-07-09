package com.string.programs;

public class ZigZagConversion {

	public static void main(String[] args) {
		String s ="PAYPALISHIRING";
		int numRows = 3;
		String convert = convert(s, numRows);
		System.out.println(convert);
//		char[] charArray = s.toCharArray();
//		int zigVal = (numRows - 2) + numRows;
//		StringBuilder strBuilder = new StringBuilder();
//		strBuilder.append(charArray[0]);
//		for (int i=0; i<numRows; i++) {
//			int j = i;
//			while(j + zigVal < charArray.length) {
//				strBuilder.append(charArray[j + zigVal]);
//				j = j + zigVal;
//			}
//			System.out.println(strBuilder.toString());
//		}

	}
    public static String convert(String s, int numRows) {

        StringBuilder res = new StringBuilder();
//If there is only one row, return original string
        if(numRows==1){
            return s;
        }
//Set first factor
        int[] factors = new int[]{ 2 * (numRows-1), 0};
        for (int j = 0; j < numRows; j++) {
            factors[1] = factors[0] - (j*2);
            for (int i = 0; i <s.length() ; i+=factors[0]) {
                if(i + j < s.length()) {
                    res.append(s.charAt(j + i));
                }
                if(j==0 || j==numRows-1){
                    continue;
                }
                if(j + i + factors[1] < s.length()){
                    res.append(s.charAt(j+i+factors[1]));
                }
            }
        }
        return res.toString();
    }

}
