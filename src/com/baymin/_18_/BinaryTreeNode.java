package com.baymin._18_;
/**
 * �������ڵ���
 * @author Baymin
 * @date 2016��7��28��
 */
public class BinaryTreeNode {
	protected int value;
	protected BinaryTreeNode left;
	protected BinaryTreeNode right;
	
	public BinaryTreeNode() {
		super();
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