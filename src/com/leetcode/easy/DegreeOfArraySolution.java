package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DegreeOfArraySolution {
	public static void main(String[] args) {
		System.out.println(new DegreeOfArraySolution().findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
	}
	
	public int findShortestSubArray(int[] nums) {
		
		if(nums.length == 1) {
			return 1;
		}
		
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int i: nums) {
        	if(map.get(i) == null) {
        		map.put(i, 1);
        	} else {
        		map.put(i, map.get(i) + 1);
        	}
        }
        
        
        Iterator<Integer> it = map.keySet().iterator();
        int max = -1;
        while(it.hasNext()) {
        	int element = it.next(), count = map.get(element);
        	if(count >= max) {
        		max = count;
        	}
        }
        
        List<Integer> maxList = new ArrayList<>();
        Iterator<Integer> maxFinder = map.keySet().iterator();
        while(maxFinder.hasNext()) {
        	int el = maxFinder.next();
        	if(map.get(el) == max)
        		maxList.add(el);
        }
        
        Iterator<Integer> itr = maxList.iterator();
        int minDiff = -1;
        
        while(itr.hasNext()) {
        	int el = itr.next();
        	int fromI = -1, toI = -1;
        	for(int i = 0; i < nums.length; i++) {
            	if(nums[i] == el) {
            		if(fromI == -1) {
            			fromI = i;
            		}
            		
            		toI = i;
            	}
            }
        	
        	if(minDiff > toI - fromI || minDiff == -1) {
        		minDiff = toI - fromI;
        	}
        }
        
        return minDiff + 1;
    }
}
