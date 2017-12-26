package com.leetcode.easy;

import com.leetcode.datastructures.TreeNode;

public class LongestUnivaluePath {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(-7);
		root.right = new TreeNode(-3);
		root.right.left = new TreeNode(-9);
		root.right.right = new TreeNode(-3);
		root.right.left.left = new TreeNode(9);
		root.right.left.right = new TreeNode(-7);
		root.right.left.right.left = new TreeNode(-6);
		root.right.left.right.left.left = new TreeNode(5);
		root.right.left.right.right = new TreeNode(-6);
		root.right.left.right.right.left = new TreeNode(9);
		root.right.left.right.right.left.left = new TreeNode(-2	);
		root.right.right.left = new TreeNode(-4);
		root.right.left.left.left = new TreeNode(6);
		root.right.left.left.left.left = new TreeNode(0);
		root.right.left.left.left.left.right = new TreeNode(-1);
		root.right.left.left.left.right = new TreeNode(6);
		root.right.left.left.left.right.left = new TreeNode(-4);
		
		System.out.println(new LongestUnivaluePath().longestUnivaluePath(root));
	}
	
	public int longestUnivaluePath(TreeNode root) {
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null) { // Leaf Node
			return root.length;
		}
		
		int leftLen = 0, rightLen = 0;
		if(root.left != null) {
			leftLen = longestUnivaluePath(root.left);
			
			if(root.value == root.left.value) {
				root.length += leftLen + 1;
			}
			else {
				root.length = Math.max(leftLen, root.length);
			}
		}	
		
		if(root.right != null) {
			rightLen = longestUnivaluePath(root.right);		
			if(root.value == root.right.value) {
				root.length += rightLen + 1;
			}
			else {
				root.length = Math.max(rightLen, root.length);
			}
		}			
		return root.length;
	}
}
