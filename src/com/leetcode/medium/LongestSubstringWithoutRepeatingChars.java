package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
	public int lengthOfLongestSubstring(String s) {
        char []sArr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        
        int max = 0;
        
        for(int i = 0, j = i; i < sArr.length && j < sArr.length;) {
            if(!set.contains(sArr[j])) {
                set.add(sArr[j++]);
                if(max < j - i)
                    max = j - i;
            } else {
                set.remove(sArr[i++]);
            }
        }
        
        return max;
    }
}
