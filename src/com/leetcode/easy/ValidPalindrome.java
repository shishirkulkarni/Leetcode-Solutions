package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
	public static void main(String[] args) {
		System.out.println(new ValidPalindrome().isPalindrome("0P"));
	}
	
	public boolean isPalindrome(String s) {
		List<Character> l = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				l.add(Character.toLowerCase(s.charAt(i)));
			}
		}
		
		System.out.println(l);
		int length = l.size(), i;
		for(i = 0; i < length / 2; i++) {
			if(l.get(i) != l.get(length - i - 1))
				break;
		}
		
		if(i == length / 2)
			return true;
		return false;
	}
}
