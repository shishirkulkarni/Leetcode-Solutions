package com.leetcode.easy;

public class ExcelColumnSolution {
	public static void main(String[] args) {
		System.out.println(new ExcelColumnSolution().titleToNumber("ABA"));
	}
	
	public int titleToNumber(String s) {
        int colNo = 0;
        char[] arr = s.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--) {
        	double mult = Math.pow(26, arr.length - i - 1);
        	colNo += mult * (arr[i] - 'A' + 1);
        }
        
        return colNo;
    }
	
}
