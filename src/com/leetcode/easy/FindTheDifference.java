package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

	public char findTheDifference(String s, String t) {
		Map<Character, Boolean> map = new HashMap<>();
		for(char c: s.toCharArray()) {
			map.put(c, true);
		}
		
		for(char c: t.toCharArray()) {
			if(!map.containsKey(c))
				return c;
		}
		
		return '\0';
	}
}
