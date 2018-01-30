package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.datastructures.TreeNode;

public class BinaryTreeInorderTraversal {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root));

	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
  		if(root == null)
			return new ArrayList<>();
		
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> s = new Stack<>();
		TreeNode cur;
		s.push(root);
        while(s.size() > 0) {
        	cur = s.peek();
            if(cur.left != null) {
				s.push(cur.left);
				cur.left = null;
			} else {
				cur = s.pop();
                res.add(cur.value);
                if(cur.right != null)
                	s.push(cur.right);  
			}            
		}
		return res;
	}
}
