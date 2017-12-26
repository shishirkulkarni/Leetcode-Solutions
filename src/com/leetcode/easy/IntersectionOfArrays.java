package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionOfArrays {
	public static void main(String[] args) {
		
	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Boolean> master = new HashMap<>();
		Map<Integer, Integer> intersection = new HashMap<>();
		for(int i: nums1)
			master.put(i, true);

		int size = 0;
		for(int i: nums2) {
			if(!master.containsKey(i)) {
				intersection.put(i, 1);
				size++;
			}
			else {
				intersection.put(i, intersection.get(i) + 1);
				size++;
			} 
		}
		int[] ret = new int[size];
		Iterator<Integer> it = intersection.keySet().iterator();
		int i = 0;
		while(it.hasNext()) {
			int no = it.next();
			for(int j = 0; j < intersection.get(no); j++)
				ret[i++] = no;
		}
		return ret;
    }
}
