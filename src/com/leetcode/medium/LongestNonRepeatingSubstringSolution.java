package com.leetcode.medium;

import java.util.HashMap;

public class LongestNonRepeatingSubstringSolution {
	public static void main(String[] args) {
		System.out.println(new LongestNonRepeatingSubstringSolution().lengthOfLongestSubstring("hhsghsgs"));
	}
	
	public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        HashMap<Character, Boolean> map = new HashMap<>();
        int count = 1;
        map.put(str[0], true);
        for(int i = 1; i < str.length; i++) {
        	if(map.get(str[i]) == null) {
        		map.put(str[i], true);
        		count++;
        	} else {
        		map.clear();
        		count = 0;
        	}
        }
        
        return map.size();
    }
}
