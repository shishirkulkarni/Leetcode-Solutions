package com.leetcode.easy;

public class ReverseWordsOfAString {
	
	public String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		String[] words = s.split(" ");
		int i;
		for(i = 0; i < words.length - 1; i++) {
			result.append(new StringBuilder(words[i]).reverse() + " ");
		}
		
		result.append(new StringBuilder(words[i]).reverse());
		
		
		return result.toString();
    }
}
