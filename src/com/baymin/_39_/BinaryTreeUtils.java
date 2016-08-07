package com.baymin._39_;

/**
 * 二叉树工具类
 * 
 * @author Baymin
 * @date 2016年7月28日
 */
public class BinaryTreeUtils {
	/**
	 * 二叉树的镜像
	 * 
	 * @param node
	 */
	public static void mirrorRecur(BinaryTreeNode node) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null)
			return;
		BinaryTreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;

		if (node.left != null)
			mirrorRecur(node.left);
		if (node.right != null)
			mirrorRecur(node.right);
	}

	/**
	 * 插入元素，普通二叉树
	 * 
	 * @param node
	 * @param value
	 * @return 二叉树
	 */
	public static BinaryTreeNode insert(BinaryTreeNode node, int value) {
		if (node == null) {
			node = new BinaryTreeNode(value);
		} else {
			if (node.left == null)
				node.left = insert(node.left, value);
			else
				node.right = insert(node.right, value);
		}
		return node;
	}

	/**
	 * 生成二叉搜索树
	 * 
	 * @param node
	 * @param value
	 * @return 返回二叉搜索树
	 */
	public static BinaryTreeNode insertBST(BinaryTreeNode node, Integer value) {
		if (node == null)
			return new BinaryTreeNode(value);
		int result = value.compareTo(node.value);
		if (result < 0)
			node.left = insertBST(node.left, value);
		else if (result > 0)
			node.right = insertBST(node.right, value);
		else
			;
		return node;
	}

	/**
	 * 生成完全二叉树
	 * 
	 * @param node
	 * @param num
	 * @param index
	 * @return 完全二叉树
	 */
	public static BinaryTreeNode buildCompleteBT(BinaryTreeNode node,
			int[] num, int index) {
		if (index >= num.length)
			return null;
		node = new BinaryTreeNode(num[index]);
		node.left = buildCompleteBT(node.left, num, 2 * index + 1);
		node.right = buildCompleteBT(node.right, num, 2 * index + 2);
		return node;
	}

	/**
	 * 前序遍历
	 * 
	 * @param node
	 */
	public static void preOrder(BinaryTreeNode node) {
		if (node == null)
			return;
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	/**
	 * 中序遍历
	 * 
	 * @param node
	 */
	public static void inOrder(BinaryTreeNode node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}
	/**
	 * 将二叉搜索树在不用新节点的情况下转换为双向链表
	 * @param node
	 * @return
	 */
	public static BinaryTreeNode convertBSTToList(BinaryTreeNode node) {
		BinaryTreeNode lastNodeInList = null;
		lastNodeInList = convertBSTToList(node, lastNodeInList);

		BinaryTreeNode headNodeInList = lastNodeInList;
		while (headNodeInList != null && headNodeInList.left != null)
			headNodeInList = headNodeInList.left;
		return headNodeInList;
	}
	/**
	 * 将二叉搜索树在不用新节点的情况下转换为双向链表
	 * @param node
	 * @param lastNodeInList
	 * @return
	 */
	public static BinaryTreeNode convertBSTToList(BinaryTreeNode node,
			BinaryTreeNode lastNodeInList) {
		if (node == null)
			return lastNodeInList;
		BinaryTreeNode curr = node;
		if (curr.left != null)
			lastNodeInList = convertBSTToList(node.left, lastNodeInList);
		curr.left = lastNodeInList;
		if (lastNodeInList != null)
			lastNodeInList.right = curr;
		lastNodeInList = curr;
		if (curr.right != null)
			lastNodeInList = convertBSTToList(node.right, lastNodeInList);
		return lastNodeInList;
	}
	/**
	 * 二叉树的深度
	 * @param root
	 * @return
	 */
	public static int treeDepth(BinaryTreeNode root){
		if(root==null)
			return 0;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		
		return (left>right) ? (left+1):(right+1);
	}
	/**
	 * 判断是不是平衡二叉树
	 */
	public static boolean isBalanced(BinaryTreeNode root, int depth){
		if(root==null){
			depth = 0;
			return true;
		}
		int left = 0,right = 0;
		if(isBalanced(root.left, left) && isBalanced(root.right, right)){
			int diff = left-right;
			if(diff<=1 && diff>=-1){
				depth = 1+(left>right ? left:right);
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断是不是平衡二叉树
	 * @param root
	 * @return
	 */
	public static boolean isBalanced(BinaryTreeNode root) {
		int depth = 0;
		return isBalanced(root, depth);
	}
}
