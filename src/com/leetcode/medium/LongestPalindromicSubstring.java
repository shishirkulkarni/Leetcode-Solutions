package com.leetcode.medium;

//Strategy: Expand palindrome in both directions

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		System.out.println(new LongestPalindromicSubstring().longestPalindrome(""));
	}
	
	public String longestPalindrome(String s) {
		
		if(s.length() == 0)
			return "";
		
		int begin = 0, end = 0, max = end - begin + 1;
		// Odd Length Palindrome
		for(int i = 0; i < s.length(); i++) {
			int j, k;
			for(j = i - 1, k = i + 1; j >= 0 && k < s.length(); j--, k++) {
				if(s.charAt(j) != s.charAt(k))
					break;
				
				if(max <= k - j + 1) {
					end = k;
					begin = j;
					max = end - begin + 1;					
				}
			}
		}

		for(int i = 0; i < s.length(); i++) {
			int j, k;
			for(j = i, k = i + 1; j >= 0 && k < s.length(); j--, k++) {
				if(s.charAt(j) != s.charAt(k))
					break;
				if(max <= k - j + 1) {
					end = k;
					begin = j;
					max = end - begin + 1;					
				}
			}
		}
		
		return s.substring(begin, end + 1);
	}
}
