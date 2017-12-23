package com.leetcode.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode() {
		value = 0;
		left = null;
		right = null;
	}
	
	public TreeNode(int value) {
		this();
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value + " ";
	}
	
	public static void printTree(TreeNode n) {
		LinkedList<TreeNode> q = new LinkedList<>();
		q.addLast(n);
		while(q.size() > 0) {
			TreeNode p = q.removeFirst();
			System.out.println(p);

			if(p.left != null)
				q.addLast(p.left);	
			
			if(p.right != null)
				q.addLast(p.right);
			
		}
	}
}
