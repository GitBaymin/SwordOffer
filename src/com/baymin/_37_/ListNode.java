package com.baymin._37_;
/**
 * ��������
 * @author Baymin
 * @date 2016��8��5��
 */
public class ListNode {
	int value;
	ListNode next;
	// ���췽��
	public ListNode() {
		super();
		value = 0;
		next = null;
	}
	public ListNode(int value) {
		super();
		this.value = value;
		next = null;
	}
	// ���������
	public static int length(ListNode root){
		int length=0;
		ListNode node = root;
		while(node!=null){
			++length;
			node = node.next;
		}
		return length;
	}
	@Override
	public String toString() {
		return "value=" + value + ", next->" + next ;
	}
}
