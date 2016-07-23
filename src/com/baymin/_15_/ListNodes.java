package com.baymin._15_;
/**
 * 链表工具类
 * @author BaiXue
 * @date 2016年7月23日
 */
public class ListNodes {
	/**
	 * 链表中倒数第k个结点
	 * @param head
	 * @param k
	 * @return
	 */
	public static Integer findKthToTail(ListNode head,int k){
		if(head==null || k <= 0){
			return null;
		}
		ListNode n1 = head;
		ListNode n2 = null;
		for (int i = 0; i < k-1; ++i){
			if(n1.nextNode!=null){
				n1 = n1.nextNode;
			}else{
				return null;
			}
		}
		n2 = head;
		while(n1.nextNode!=null){
			n1 = n1.nextNode;
			n2 = n2.nextNode;
		}
		return n2.getValue();
	}
}
