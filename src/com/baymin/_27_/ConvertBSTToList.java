package com.baymin._27_;
/**
 * 将二叉搜索树在不用新节点的情况下转换为双向链表实例
 * @author BaiXue
 * @date 2016年8月2日
 */
public class ConvertBSTToList {

	public static void main(String[] args) {
		int[] num = {10,6,4,8,14,12,16};
		BinaryTreeNode node = null;
		for (int i = 0; i < num.length; i++) {
			node=BinaryTreeUtils.insertBST(node, num[i]);
		}
		BinaryTreeNode head = BinaryTreeUtils.convertBSTToList(node);
		while(head!=null){
			if(head.right==null){
				System.out.print(head.value);
				break;
			}
			System.out.print(head.value+"->");
			head = head.right;
		}
	}

}
