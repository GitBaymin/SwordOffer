package com.baymin._16_;
/**
 * ������
 * @author BaiXue
 * @date 2016��7��23��
 */
public class ListNodes {
	/**
	 * ��ת������
	 * @param head
	 * @return
	 */
	public static ListNode ReverseList(ListNode head){
		if(head==null){
			return null;
		}
		ListNode reverHead = null;
		ListNode currNode = head;
		ListNode preNode = null;
		while(currNode!=null){
			ListNode nextNode = currNode.nextNode;
			if(nextNode==null){
				reverHead = currNode;
			}
			currNode.nextNode = preNode;
			preNode = currNode;
			currNode = nextNode;
		}
		return reverHead;
	}
}
