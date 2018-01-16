package com.leetcode.medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMatrixZero {
	public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        for(int  i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        Iterator<Integer> it = rows.iterator();
        while(it.hasNext()) {
            int row = it.next();
            for(int j = 0; j < matrix[row].length; j++) {
                matrix[row][j] = 0;
            }
        }
        it = cols.iterator();
        while(it.hasNext()) {
            int col = it.next();
            for(int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }
    }
}
