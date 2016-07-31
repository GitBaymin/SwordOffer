package com.baymin._25_;

/**
 * ������������
 * @author Baymin
 * @date 2016��7��28��
 */
public class BinaryTreeUtils {
	/**
	 * �������ľ���
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
	 * ����Ԫ��
	 * @param node
	 * @param value
	 * @return ������
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
	 * ������ȫ������
	 * @param node
	 * @param num
	 * @param index
	 * @return ��ȫ������
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
	 * ǰ�����
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
	 * �������
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
