package com.leetcode.easy;

public class RangeAdditionSolution {
	public static void main(String[] args) {
		System.out.println(new RangeAdditionSolution().maxCount(3, 3, new int[][] {{2, 2}, {3, 3}}));
	}
	public int maxCount(int m, int n, int[][] ops) {
		if(ops.length == 0)
			return m * n;
		int minRow = ops[0][0], 
			minCol = ops[0][1];
		for(int[] op: ops) {
			if(op[0] == 0 && op[1] == 0) {
				continue;
			}
			
			if(minRow > op[0]) {
				minRow = op[0];
			}
			
			if(minCol > op[1]) {
				minCol = op[1];
			}
		}
		
		return minRow * minCol;
    }
}
