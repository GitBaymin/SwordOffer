package com.baymin._25_;

/**
 * 二叉树工具类
 * @author Baymin
 * @date 2016年7月28日
 */
public class BinaryTreeUtils {
	/**
	 * 二叉树的镜像
	 * @param node
	 */
	public static void mirrorRecur(BinaryTreeNode node){
		if(node==null){
			return;
		}
		if(node.left==null && node.right==null)
			return;
		BinaryTreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		if(node.left!=null)
			mirrorRecur(node.left);
		if(node.right!=null)
			mirrorRecur(node.right);
	}
	/**
	 * 插入元素
	 * @param node
	 * @param value
	 * @return 二叉树
	 */
	public static BinaryTreeNode insert(BinaryTreeNode node,int value){
		if(node==null){
			node = new BinaryTreeNode(value);
		}else{
			if(node.left==null)
				node.left = insert(node.left,value);
			else
				node.right = insert(node.right,value);
		}
		return node;
	}
	/**
	 * 生成完全二叉树
	 * @param node
	 * @param num
	 * @param index
	 * @return 完全二叉树
	 */
	public static BinaryTreeNode buildCompleteBT(BinaryTreeNode node,int[] num,int index){
		if(index>=num.length)
			return null;
		node = new BinaryTreeNode(num[index]);
		node.left = buildCompleteBT(node.left, num, 2*index+1);
		node.right = buildCompleteBT(node.right, num, 2*index+2);
		return node;
	}
	/**
	 * 前序遍历
	 * @param node
	 */
	public static void preOrder(BinaryTreeNode node){
		if(node==null)
			return ;
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	/**
	 * 中序遍历
	 * @param node
	 */
	public static void inOrder(BinaryTreeNode node){
		if(node==null)
			return ;
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
}
