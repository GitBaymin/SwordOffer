package com.baymin._39_;
/**
 * 二叉树深度测试
 * @author Baymin
 * @date 2016年8月6日
 */
public class Test {

	public static void main(String[] args) {
		int [] data = {1,2,3,4,5,6,7};
		BinaryTreeNode root = null;
		root = BinaryTreeUtils.buildCompleteBT(root, data, 0);
		BinaryTreeUtils.preOrder(root);
		System.out.println("\n"+BinaryTreeUtils.treeDepth(root));
	}

}
