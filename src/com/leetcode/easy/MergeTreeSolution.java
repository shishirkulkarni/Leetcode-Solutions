package com.leetcode.easy;

import com.leetcode.datastructures.TreeNode;

public class MergeTreeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tree1
		TreeNode r1 = new TreeNode(1), r2 = new TreeNode(2);
		r1.left = new TreeNode(3);
		r1.left.left = new TreeNode(5);
		r1.right = new TreeNode(2);
		
		r2.left = new TreeNode(1);
		r2.left.right = new TreeNode(4);
		r2.right = new TreeNode(3);
		r2.right.right = new TreeNode(7);
		
		TreeNode.printTree(new MergeTreeSolution().mergeTrees(r1, r2));
		
	}
	
	public TreeNode mergeTrees(TreeNode n1, TreeNode n2) {
		TreeNode result = null;
		if(n1 == null && n2 == null)
			return result;
		
		if(n1 != null && n2 != null) {
			result = new TreeNode(n1.value + n2.value);
		}
		
		if(n1 != null && n2 == null) {
			result = new TreeNode(n1.value);
		}
		
		if(n1 == null && n2 != null) {
			result = new TreeNode(n2.value);
		}
		
		TreeNode left = mergeTrees(n1 == null ? null : n1.left, n2 == null ? null : n2.left);
		TreeNode right = mergeTrees(n1 == null ? null : n1.right, n2 == null ? null : n2.right);
		
		result.left = left;
		result.right = right;
		
		return result;
		
	}

}
