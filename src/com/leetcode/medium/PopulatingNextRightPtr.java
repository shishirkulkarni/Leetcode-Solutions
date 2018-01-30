package com.leetcode.medium;

import java.util.LinkedList;
import com.leetcode.datastructures.TreeNode;

public class PopulatingNextRightPtr {
	public static void main(String[] args) {
		new PopulatingNextRightPtr().connect(new TreeNode());
	}
	
    public void connect(TreeNode root) {
        LinkedList<TreeNode> l = new LinkedList<>();
        l.add(root);
        l.add(null);
        System.out.println(l);
    }
}
