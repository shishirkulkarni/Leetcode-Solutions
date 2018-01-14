package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {
	
	public static void main(String[] args) {
		System.out.println(new ArrayIntersection().intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2}));
	}
	
	
	public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums1) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        for(int i: nums2) {
            System.out.println(map.get(i));
        	if(map.containsKey(i)) {
                if(map.get(i) > 0) {
                    res.add(i);
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i);
                }
            }
        }
        
        int []a = new int[res.size()];
        int k = 0;
        Iterator<Integer> it = res.iterator();
        while(it.hasNext()) {
        	a[k++] = it.next();
        }
        
        
        return a;
    }
}
