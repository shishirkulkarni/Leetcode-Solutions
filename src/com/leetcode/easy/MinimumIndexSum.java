package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MinimumIndexSum {
	public static void main(String[] args) {
		System.out.println(new MinimumIndexSum().findRestaurant(new String[] {"Shogun","Tapioca Express","Burger King","KFC"}, new String[] {"KFC","Burger King","Tapioca Express","Shogun"}).length);
	}
	
	public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		
		int min = list1.length + list2.length;
		List<String> res = new ArrayList<>();
		for(int i = 0; i < list2.length; i++) {
			Integer index;
			if((index = map.get(list2[i])) == null)
				continue;
			if(min > index + i) {
				res = new ArrayList<>();
				res.add(list2[i]);
				min = index + i;
			} else if(min == index + i) {
				res.add(list2[i]);
			}
		}
		
		
		return res.toArray(new String[res.size()]);
	}
}
