package com.baymin._39_;
/**
 * ��������Ȳ���
 * @author Baymin
 * @date 2016��8��6��
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
