package com.leetcode.easy;

public class ReshapeMatrixSolution {
	
	public static void main(String[] args) {
		System.out.println(new ReshapeMatrixSolution().matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4));
	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int ro = nums.length, co = nums[0].length;
		if(ro * co != r * c)
        	return nums;
        int arr[] = new int[r * c];
        int result[][] = new int[r][c];
        for(int i = 0, res_i = 0; i < ro; i++) {
        	for(int j = 0; j < co; j++) {
        		arr[res_i ++] = nums[i][j];
        	}
        }
        
        for(int i = 0, arr_i = 0; i < r; i++) {
        	for(int j = 0; j < c; j++) {
        		result[i][j] = arr[arr_i++];
        	}
        }
        return result;
    }

}
