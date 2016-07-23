package com.baymin._17_;
/**
 * ��������
 * @author BaiXue
 * @date 2016��7��23��
 */
public class ListNodes {
	/**
	 * �ϲ��������������
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
