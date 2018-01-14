package com.leetcode.easy;

public class StringReverse {
	
	public static void main(String[] args) {
		System.out.println(new StringReverse().reverseString("abc"));
	}
	
	 public String reverseString(String s) {
		 char[] str = s.toCharArray();
		 for(int i = 0; i < str.length / 2; i++) {
			 char c = str[i];
			 str[i] = str[str.length - i - 1];
			 str[str.length - i - 1] = c;
		 }
		 
		 return new String(str);
	 }
}
