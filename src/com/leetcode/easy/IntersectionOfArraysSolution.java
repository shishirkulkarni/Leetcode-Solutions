package com.leetcode.easy;

import java.util.HashMap;
import java.util.Iterator;

public class IntersectionOfArraysSolution {
	
	public static void main(String[] args) {
		new IntersectionOfArraysSolution().intersection(new int[] {1, 2, 2, 1},  new int[] {2, 2});
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i: nums1) {
			map.put(i, true);
		}
		
		HashMap<Integer, Boolean> map2 = new HashMap<>();
		for(int i: nums2) {
			if(map.get(i) == null) {
				continue;
			} else {
				map2.put(i, true);
			}
		}
		
		int res[] = new int[map2.size()];
		int i = 0;
		Iterator<Integer> it = map2.keySet().iterator();
		while(it.hasNext()) {
			res[i++] = it.next();
		}
		return res;
    }
}
