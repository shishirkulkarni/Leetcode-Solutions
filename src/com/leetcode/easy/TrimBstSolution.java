package com.leetcode.easy;

import com.leetcode.datastructures.TreeNode;
public class TrimBstSolution {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(0);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(1);
		TreeNode.printTree(new TrimBstSolution().trimBST(root, 1, 3));
		
	}
	
	public TreeNode trimBST(TreeNode root, int L, int R) {
		while(true && root != null) {
			if(L <= root.value && root.value <= R) {
				break;
			}
			
			if(L > root.value) {
				root = root.right;
			} else if(R < root.value) {
				root = root.left;
			}
		}
		
		return prune(root, L, R);
    }
	
	public TreeNode prune(TreeNode root, int L, int R) {
		if(root == null)
			return null;
		
		TreeNode left = null, right = null;
		if(L < root.value) {
			left = prune(root.left, L, R);			
		} else {
			left = null;
		}
		
		if(R > root.value) {
			right = prune(root.right, L, R);
		} else {
			right = null;
		}
			
		root.left = left;
		root.right = right;
		return root;
	}
}
