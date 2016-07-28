package com.baymin._18_;
/**
 * 是否含有子树
 * @author Baymin
 * @date 2016年7月28日
 */
public class HasSubtree {
	
	public static void main(String[] args) {
		BinaryTreeNode root1 = null;
		BinaryTreeNode root2 = null;
		
		root1 = BinaryTreeNodes.insert(root1, 1);
//		root1 = BinaryTreeNodes.insert(root1, 2);
//		root1 = BinaryTreeNodes.insert(root1, 3);
//		root1 = BinaryTreeNodes.insert(root1, 4);
		System.out.println(root1.toString());
		
		root2 = BinaryTreeNodes.insert(root2, 1);
//		root2 = BinaryTreeNodes.insert(root2, 2);
//		root2 = BinaryTreeNodes.insert(root2, 3);
		System.out.println(root2.toString());
		
		System.out.println(BinaryTreeNodes.hasSubtreeMethod(root1, root2));
	}

}
