package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		System.out.println(new GroupAnagrams().groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> listMap = new HashMap<>();
				
		for(int i = 0; i < strs.length; i++) {
			char []arr = strs[i].toCharArray();
			
			Arrays.sort(arr);
			
			if(listMap.containsKey(new String(arr))) {
				listMap.get(new String(arr)).add(strs[i]);
			} else {
				listMap.put(new String(arr), new ArrayList<String>());
				listMap.get(new String(arr)).add(strs[i]);
			}
		}
		
		return new ArrayList<>(listMap.values());
	}
}
