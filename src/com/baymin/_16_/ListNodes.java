package com.baymin._16_;
/**
 * 工具类
 * @author BaiXue
 * @date 2016年7月23日
 */
public class ListNodes {
	/**
	 * 反转链表方法
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
