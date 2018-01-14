package com.leetcode.easy;

/*
 * The trick here is using XOR. Because, since XOR is commutative ( a ^ b ) ^ c = a ^ (b ^ c)
 * Now the array contains only one unique elements so the xors of duplicate elements would cancel each other out.
 * Thus xor ing the entire array will give you the only unique element
 */

public class SingleDuplicateNumber {
	public int singleNumber(int[] nums) {
        int res = 0;
        for(int i: nums) {
        	res ^= i;
        }
        
        return res;
        
    }
}
