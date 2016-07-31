package com.baymin._23_;

import java.util.LinkedList;

/**
 * 从上往下打印二叉树
 * @author Baymin
 * @date 2016年7月31日
 */
public class PrintFromTopToBottomDemo {
	public static void printFromTopToBottom(BinaryTreeNode root){
		if(root==null)
			return;
		//辅助队列
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.addLast(root);
		while(!queue.isEmpty()){
			BinaryTreeNode node = queue.pollFirst();
			System.out.print(node.value+" ");
			if(node.left!=null)
				queue.addLast(node.left);
			if(node.right!=null)
				queue.addLast(node.right);
		}
	}
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7};
		BinaryTreeNode root = null;
		root = BinaryTreeUtils.buildCompleteBT(root, num, 0);
		BinaryTreeUtils.inOrder(root);
		System.out.println();
		printFromTopToBottom(root);
	}

}
