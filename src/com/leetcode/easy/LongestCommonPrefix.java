package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[] {"aac", "a", "ccc"}));
	}
	
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) {
			return "";
		}

		int min = 0;
		char []map = strs[0].toCharArray();
		
		min = map.length;
		
		for(int i = 1; i < strs.length; i++) {
			int count = 0;
			for(char c: strs[i].toCharArray()) {
				if(count >= min)
					break;
				if(c == map[count])
					count++;
				else
					break;
			}
						
			if(min > count)
				min = count;
			
		}
		
		return strs[0].substring(0, min);
    }

}
