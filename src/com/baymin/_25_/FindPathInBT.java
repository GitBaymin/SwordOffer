package com.baymin._25_;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * 在二叉树中寻找和为某一值的路径
 * @author Baymin
 * @date 2016年7月31日
 */
public class FindPathInBT {
	/**
	 * 在二叉树中寻找和为某一值的路径
	 * @param root
	 * @param expectedSum
	 */
	public static void findPath(BinaryTreeNode root,int expectedSum){
		if(root==null)
			return;
		ArrayDeque<Integer> path = new ArrayDeque<Integer>();
		int currentSum = 0;
		findPath(root, expectedSum, path, currentSum);
	}
	/**
	 * 在二叉树中寻找和为某一值的路径
	 * @param root
	 * @param expectedSum
	 * @param path
	 * @param currentSum
	 */
	public static void findPath(BinaryTreeNode root,int expectedSum,
			ArrayDeque<Integer> path,int currentSum){
		currentSum += root.value;
		path.addLast(root.value);
		boolean isLeaf = root.left==null && root.right==null;
		if(currentSum == expectedSum && isLeaf){
			System.out.println("A path is found:");
			Iterator<Integer> iter = path.iterator();
			while(iter.hasNext()){
				System.out.print(iter.next()+" ");
			}
			System.out.println();
		}
		if(root.left!=null)
			findPath(root.left, expectedSum, path, currentSum);
		if(root.right!=null)
			findPath(root.right, expectedSum, path, currentSum);
		path.pollLast();
	}
	public static void main(String[] args) {
		int[] num = {10,5,12,4,7};
		BinaryTreeNode root = null;
		root = BinaryTreeUtils.buildCompleteBT(root, num, 0);
		BinaryTreeUtils.preOrder(root);
		System.out.println();
		findPath(root, 22);
	}

}
