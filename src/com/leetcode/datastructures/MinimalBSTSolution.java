package com.leetcode.datastructures;

import java.util.LinkedList;

public class MinimalBSTSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t = new BinaryTree();
		new MinimalBSTSolution().solve(t, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(t.root);
//		t.inorder(t.root);
//		System.out.println(t.height(t.root) - 1);
		System.out.println(t.isBalanced(t.root));
	}
	
	public void solve(BinaryTree t, int[] values) {
		t.insertBinary(values[values.length / 2]);
		
		int i;
		for(i = values.length / 2 - 2; i >= 0; i -= 2) {
			t.insertBinary(values[i]);
			t.insertBinary(values[i + 1]);
		}
		
		if(i == -1) {
			t.insertBinary(values[0]);
		}
		
		for(i = values.length / 2 + 2; i < values.length; i += 2) {
			t.insertBinary(values[i]);
			t.insertBinary(values[i - 1]);
		}
		
		if(i == values.length) {
			t.insertBinary(values[i - 1]);
		}
	}


}
