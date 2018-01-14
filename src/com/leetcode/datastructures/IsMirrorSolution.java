package com.leetcode.datastructures;

import java.util.LinkedList;

public class IsMirrorSolution {
	
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.insert(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		System.out.println(new IsMirrorSolution().isMirror(t.root, t.root));
		System.out.println(new IsMirrorSolution().leftSum(t.root));
	}
	
	public void printLevelOrder(BinaryTree t) {
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(t.root);
		
		while(!queue.isEmpty()) {
			TreeNode tnode = queue.removeFirst();
			
			System.out.print(tnode + " ");

			if(tnode.left != null)
				queue.addLast(tnode.left);
			if(tnode.right != null)
				queue.addLast(tnode.right);
		}
	}
	
	public boolean isMirror(TreeNode n1, TreeNode n2) {
		if(n1 == null && n2 == null)
			return true;
		if(n1 == null || n2 == null)
			return false;
		
		return n1.value == n2.value && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
	}
	
	
	/**
	 * Calculates the sum of leaves in a binary tree
	 * The idea is to recursively calculate the sum at the parents of all left leaf nodes.
	 * Algo: 
	 * If root is null, 0
	 * if root is leaf, return 0
	 * So the natural recurrence becomes, if left leaf is node, return its value + the value of all the leafnodes from the left subtree and right subtree
	 */
	
	public int leftSum(TreeNode n) {
		if(n == null) {
			return 0;
		}
		
		if(n.left == null && n.right == null) {
			return 0;
		}
		
		return  leftSum(n.left) + leftSum(n.right) + (n.left.left == null && n.left.right == null ? n.left.value : 0);
	}
}
