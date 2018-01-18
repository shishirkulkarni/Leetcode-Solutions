package com.leetcode.easy;

public class SmallestLetterGreaterThanTarget {
	public char nextGreatestLetter(char[] letters, char target) {
		boolean chars[] = new boolean[26];

		for(char c: letters) {
			chars[c - 'a'] = true;
		}

		for(int  i = target - 'a' + 1; i != (target - 'a' - 1)  % 26; i++) {
			if(chars[i % 26])
				return (char)((i % 26) + 'a');
		}

		return ' ';
	}
}
