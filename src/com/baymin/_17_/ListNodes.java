package com.baymin._17_;
/**
 * 链表工具类
 * @author BaiXue
 * @date 2016年7月23日
 */
public class ListNodes {
	/**
	 * 合并两个有序的链表
	 * @param head1
	 * @param head2
	 * @return
	 */
	public static ListNode merge(ListNode head1,ListNode head2){
		if(head1==null){
			return head2;
		}else if(head2 == null){
			return head1;
		}
		ListNode mergedHead = null;
		if(head1.getValue()<head2.getValue()){
			mergedHead = head1;
			mergedHead.nextNode = merge(head1.nextNode, head2);
		}else {
			mergedHead = head2;
			mergedHead.nextNode = merge(head1, head2.nextNode);
		}
		return mergedHead;
	}
}
