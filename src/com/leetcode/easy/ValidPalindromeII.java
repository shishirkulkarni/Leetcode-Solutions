package com.leetcode.easy;

public class ValidPalindromeII {
	public static void main(String[] args) {
		System.out.println(new ValidPalindromeII().validPalindrome("bddb"));
	}
	
	public boolean validPalindrome(String s) {
		int len = s.length(), count = 0, i, j;
		boolean flag = false;
		char []s_arr = s.toCharArray();
		
		for(i = 0, j = len - 1; i < j; i++, j--) {
			if(s_arr[i] == s_arr[j])
				continue;
			count++;
			i++;
			if(i >= j)
				break;
		}
		
		if(count <= 1 && i == j)
			return true;
		return false;
	}
}
