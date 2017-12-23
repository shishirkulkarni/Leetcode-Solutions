package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class OneRowKbdSolution {
	
	public static void main(String[] args) {
		System.out.println(new OneRowKbdSolution().findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"}));
		
	}
	
	public String[] findWords(String[] words) {
		
		List<String> l = new ArrayList<>();
		int kbd[] = new int[] {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
		for(String s: words) {
			int row = kbd[Character.toLowerCase(s.charAt(0)) - 'a'];
			char[] charArray = s.toLowerCase().toCharArray();
			int i;
			for(i = 0; i < charArray.length; i++) {
				if(kbd[charArray[i] - 'a'] != row) {
					break;
				}
			}
			
			if(i == charArray.length) {
				l.add(s);
			}				
		}
		
		String[] result = new String[l.size()];
		Iterator<String> it = l.iterator();
		int j = 0;
		while(it.hasNext()) {
			result[j++] = it.next();
		}
		return result;
    }
}
