package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public static void main(String[] args) {
		ContainsDuplicate d = new ContainsDuplicate();
		System.out.println(d.containsDuplicate(new int[] {}));
	}
	
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Boolean> duplicates = new HashMap<>();
		for(int i: nums) {
			if(duplicates.containsKey(i))
				return true;
			duplicates.put(i, true);
		}
		return false;
    }
}
