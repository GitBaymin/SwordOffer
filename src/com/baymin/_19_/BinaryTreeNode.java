package com.baymin._19_;
/**
 * 二叉树节点类
 * @author Baymin
 * @date 2016年7月28日
 */
public class BinaryTreeNode {
	protected int value;
	protected BinaryTreeNode left;
	protected BinaryTreeNode right;
	
	public BinaryTreeNode() {
		super();
		value = 0;
		left = null;
		right = null;
	}

	public BinaryTreeNode(int value) {
		super();
		this.value = value;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [value=" + value + ", left=" + left + ", right="
				+ right + "]";
	}
	
}
