package com.baymin._19_;

/**
 * �������ľ���
 * @author Baymin
 * @date 2016��7��28��
 */
public class MirrorRecur {
//	public static void 
	public static void main(String[] args) {
		BinaryTreeNode root1 = null;
		BinaryTreeNode root2 = null;
		int[] num = {1,2,3,4,5,6,7};
		
		root1 = BinaryTreeUtils.buildCompleteBT(root1, num, 0);
//		BinaryTreeUtils.preOrder(root1);
//		root1 = BinaryTreeUtils.insert(root1, 8);
		System.out.println("------����ǰ-------");
		BinaryTreeUtils.preOrder(root1);
		System.out.println();
		BinaryTreeUtils.inOrder(root1);
		BinaryTreeUtils.mirrorRecur(root1);
		System.out.println();
		System.out.println("------�����-------");
		BinaryTreeUtils.preOrder(root1);
		System.out.println();
		BinaryTreeUtils.inOrder(root1);
		
		System.out.println();
		System.out.println("------NULL-------");
		BinaryTreeUtils.mirrorRecur(root2);
	}

}
