package com.leetcode.easy;

public class ReverseIntegerBits {
    public int reverseBits(int n) {
        boolean carry = false;
        if((n & Integer.MIN_VALUE) != 0) {
			n = n & Integer.MAX_VALUE;
            carry = true;
		}
        
        int res = 0, count  = 32;
        while(count > 0) {
            res *= 2;
            res += n % 2;
            n = n / 2;
            count--;
        }
        
        if(carry) {
            res = res | 1;
        }
        
        return res;
    }

}
