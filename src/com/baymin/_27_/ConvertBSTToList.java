package com.baymin._27_;
/**
 * �������������ڲ����½ڵ�������ת��Ϊ˫������ʵ��
 * @author BaiXue
 * @date 2016��8��2��
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
