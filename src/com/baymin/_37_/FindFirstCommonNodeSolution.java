package com.baymin._37_;
/**
 * 两个链表的第一个公共结点
 * @author Baymin
 * @date 2016年8月5日
 */
public class FindFirstCommonNodeSolution {
	public static ListNode findFirstCommonNode(ListNode root1,ListNode root2){
		if(root1==null || root2==null)
			return null;
		// 两个链表的长度
		int length1 = ListNode.length(root1);
		int length2 = ListNode.length(root2);
		// 两个链表长度的差
		int lengthDiff = length1-length2;
		// 长链表头结点
		ListNode longListHead = root1;
		ListNode shortListHead = root2;
		if(lengthDiff<0){
			lengthDiff = length2-length1;
			longListHead = root2;
			shortListHead = root1;
		}
		// 长链表先走lengthDiff步
		for (int i = 0; i < lengthDiff; i++) {
			longListHead = longListHead.next;
		}
		// 遍历直到longListHead = shortListHead
		while(longListHead!=null && shortListHead!=null && longListHead!=shortListHead){
			longListHead = longListHead.next;
			shortListHead = shortListHead.next;
		}
		
		return longListHead;
	}
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		// 第一个链表
		n1.next = n2;
		n2.next = n3;
		n3.next = n6;
		n6.next = n7;
		//第二个链表
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		ListNode common = findFirstCommonNode(n1, n4);
		System.out.println(common);
	}

}
