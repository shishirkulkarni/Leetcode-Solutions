package com.leetcode.datastructures;

public class validateBSTSolution {
	
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		t.insert(new int[] {11, 6, 8, 19, 4, 13, 5, 17, 43, 49, 16, 31, 32});
//		t.insertBinary(11);
//		t.insertBinary(6);
//		t.insertBinary(8);
//		t.insertBinary(19);
//		t.insertBinary(4);
//		t.insertBinary(13);
//		t.insertBinary(5);
//		t.insertBinary(17);
//		t.insertBinary(43);
//		t.insertBinary(49);
//		t.insertBinary(16);
//		t.insertBinary(31);
//		t.insertBinary(32);
		
		
		
		t.levelOrder(t.root);
		System.out.println(new validateBSTSolution().isBST(t.root));
	}
	
	public boolean isBST(TreeNode t) {
		if(t == null) {
			return true;
		}
		
		if(t.left == null && t.right == null) {
			return true;
		}
		
		if(t.left == null && t.right != null) {
			return isBST(t.right) && t.right.value > t.value;
		}
		
		if(t.right == null && t.left != null) {
			return isBST(t.left) && t.left.value < t.value;
		}
		
		return isBST(t.left) && isBST(t.right)
				&& t.left.value < t.value && t.value< t.right.value;
	}

}
