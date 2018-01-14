package com.leetcode.easy;

public class IslandPerimeterSolution {
	public static void main(String[] args) {
		System.out.println(new IslandPerimeterSolution().islandPerimeter(new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
		
	}
	
	public int islandPerimeter(int[][] grid) {
		int count = 0;
		int row =grid.length;
		int col = grid[0].length;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(grid[i][j] == 1) {
					if(i - 1 >= 0) {
						if(grid[i - 1][j] != 1)
							count++;
					} else {
						count++;
					}
					if(j - 1 >= 0) {
						if(grid[i][j - 1] != 1)
							count++;
					} else {
						count++;
					}
					if(i + 1 < row) {
						if(grid[i + 1][j] != 1)
							count++;
					} else {
						count++;
					}
					
					if(j + 1 < col) {
						if(grid[i][j + 1] != 1)
							count++;
					} else {
						count++;
					}
				}
			}
		}
		
		return count;
    }
}
