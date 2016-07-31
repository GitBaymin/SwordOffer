package com.baymin._24_;

import java.util.Arrays;

/**
 * 二叉搜索树的后序遍历序列
 * @author Baymin
 * @date 2016年7月31日
 */
public class IsQueueOfBSTInPostTreeTraversal{
	public static boolean isPostTreeTraversal(int[] num) throws Exception{
		if(num==null)
			throw new Exception("the num is empty.");
		int root = num[num.length-1];
		//二叉搜索树中左子树的节点小于根结点
		int i = 0;
		for (; i < num.length; i++) {
			if(num[i]>root)
				break;
		}
		
		//二叉搜索树中右子树的节点大于根节点
		for (int j = i; j < num.length-2; j++) {
			if(num[j]<root)
				return false;
		}
		
		//判断左子树是不是二叉搜索树
		boolean left = true;
		/*
		 * copyOfRange(int[] original,int from,int to)
		 * original - 将要从其复制一个范围的数组
		 * from - 要复制的范围的初始索引（包括）
		 * to - 要复制的范围的最后索引（不包括）。（此索引可以位于数组范围之外）。 
		 */
		if(i>0)
			left = isPostTreeTraversal(Arrays.copyOfRange(num, 0, i+1));
		
		//判断右子树是不是二叉搜索树
		boolean right = true;
		/*
		 * copyOfRange(int[] original,int from,int to)
		 * original - 将要从其复制一个范围的数组
		 * from - 要复制的范围的初始索引（包括）
		 * to - 要复制的范围的最后索引（不包括）。（此索引可以位于数组范围之外）。 
		 * 如果i = num.length-2说明左子树取到了倒数第二个数，此时没有右子树
		 * num.length-1是数组的最后索引
		 */
		if(i<num.length-2)
			right = isPostTreeTraversal(Arrays.copyOfRange(num, i+1, num.length-1));
		return (left && right);
	}
	public static void main(String[] args) throws Exception {
		int[] num1 = {5,7,6,9,11,10,8};
		int[] num2 = {7,4,6,5};
		System.out.println(isPostTreeTraversal(num1));
		System.out.println(isPostTreeTraversal(num2));
	}

}
