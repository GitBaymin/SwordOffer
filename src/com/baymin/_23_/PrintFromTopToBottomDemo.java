package com.baymin._23_;

import java.util.LinkedList;

/**
 * �������´�ӡ������
 * @author Baymin
 * @date 2016��7��31��
 */
public class PrintFromTopToBottomDemo {
	public static void printFromTopToBottom(BinaryTreeNode root){
		if(root==null)
			return;
		//��������
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
