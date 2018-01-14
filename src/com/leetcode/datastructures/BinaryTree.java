package com.leetcode.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree {
	TreeNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void insert(int...elements) {
		ArrayList<TreeNode> l = new ArrayList<>();
		
		
		for(int i = 0; i < elements.length; i++) {
			l.add(new TreeNode(elements[i]));
		}
		
		insertRoot(l.get(0));
		
		for(int i = 1; i < elements.length; i++) {
			if(i % 2 == 0) {
				insertRight(l.get((i - 1) / 2), l.get(i));
			} else {
				insertLeft(l.get((i - 1) / 2), l.get(i));
			}
		}
	}
	
	public void insertRight(TreeNode parent, TreeNode child) {
		parent.right = child;
	}
	
	public void insertLeft(TreeNode parent, TreeNode child) {
		parent.left = child;
	}
	
	public void insertRoot(TreeNode n) {
		root = n;
	}
	
	public void mirror(TreeNode n) {
		if(n == null) {
			return;
		}
		
		mirror(n.left);
		mirror(n.right);
		
		TreeNode temp;
		
		temp = n.left;
		n.left = n.right;
		n.right = temp;
	}
	
	public void insertBinary(int val) {
		
		if(root == null) {
			root = new TreeNode(val);
			return;
		}
		
		TreeNode follower = null, runner = root;
		
		while(runner != null) {
			if(val < runner.value ) {
				follower = runner;
				runner = runner.left;
			} else {
				follower = runner;
				runner = runner.right;
			}
		}
		
		if(follower.value > val) {
			follower.left = new TreeNode(val);
		} else {
			follower.right = new TreeNode(val);
		}	
	}
	
	public void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root);
		inorder(root.right);
	}
	
	public void levelOrder(TreeNode root) {
		LinkedList<TreeNode> q = new LinkedList<>();
		
		q.addLast(root);
		
		while(!q.isEmpty()) {
			TreeNode tmp = q.removeFirst();
			System.out.println(tmp);
			if(tmp.left != null)
				q.addLast(tmp.left);
			if(tmp.right != null)
				q.addLast(tmp.right);
		}
		
	}
	
	public int height(TreeNode n) {
		if(n == null) {
			return 0;
		}
		
		if(n.left == null && n.right == null) {
			return 1;
		}
		
		return 1 + Math.max(height(n.left), height(n.right));
	}
	
	public boolean isBalanced(TreeNode n) {
		if(n == null) {
			return true;
		}
		
		return Math.abs((height(n.left) - 1) - (height(n.right) - 1)) <= 1; 
	}
	
}
