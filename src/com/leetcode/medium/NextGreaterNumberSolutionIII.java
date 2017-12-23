package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NextGreaterNumberSolutionIII {
	
	public static void main(String[] args) {
		System.out.println(new NextGreaterNumberSolutionIII().nextGreaterElement(1234));
	}
	
	public int nextGreaterElement(int n) {
   		int res = 0, n1 = n;
		ArrayList<Integer> num = new ArrayList<>();
		while(n1 > 0) {
			num.add(n1 % 10);
			n1 = n1 / 10;
		}
		for(int i = num.size() - 1; i >= 0 ; i--) {
			int currentDifference = 10, index = i;
			for(int j = i - 1; j >= 0; j--) {
//				if(num.get(j) < num.get(i))
//					continue;
				if(num.get(j) - num.get(i) < currentDifference) {
					index = j;
					currentDifference = num.get(j) - num.get(i);
				}
			}
			int temp = num.get(index);
			num.set(index, num.get(i));
			num.set(i, temp);
		}
		
		int pow = 1;
		for(int i: num) {
			res += pow * i;
			pow *= 10;
		}
		return res == n ? -1 : res;
	}
}
