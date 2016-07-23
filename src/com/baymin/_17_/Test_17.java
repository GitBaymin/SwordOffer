package com.baymin._17_;

public class Test_17 {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(10);
		
		n1.nextNode = n2;
		n2.nextNode = n3;
		n3.nextNode = n4;
		n4.nextNode = n5;
		n5.nextNode = n6;
		
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(7);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(10);
		ListNode l6 = new ListNode(12);
		
		l1.nextNode = l2;
		l2.nextNode = l3;
		l3.nextNode = l4;
		l4.nextNode = l5;
		l5.nextNode = l6;
		
		System.out.println(ListNodes.merge(n6, l6));
	}

}
