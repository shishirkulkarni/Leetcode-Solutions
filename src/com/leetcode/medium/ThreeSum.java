package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
	
	public static void main(String[] args) {
		System.out.println(new ThreeSum().threeSum(new int[] {-1,0,1,2,-1,-4}));
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Map<Set<Integer>, List<Integer>> map = new HashMap<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			int j = 0, k = nums.length - 1;
			while(true) {
				if(i == j)
					j++;
				if(i == k)
					k--;
				if(j >= k)
					break;
				if(nums[i] + nums[j] + nums[k] == 0) {
					List<Integer> l = new ArrayList<>();
					l.add(nums[i]);
					l.add(nums[j]);
					l.add(nums[k]);
					Set<Integer> s = new HashSet<>(l);
					if(!map.containsKey(s)) {
						map.put(s, l);
						res.add(l);
					}
				}
				k--;
				j++;
			}
		}
		return res;
	}
}
