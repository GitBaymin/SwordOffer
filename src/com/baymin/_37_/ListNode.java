package com.baymin._37_;
/**
 * 链表结点类
 * @author Baymin
 * @date 2016年8月5日
 */
public class ListNode {
	int value;
	ListNode next;
	// 构造方法
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
	// 获得链表长度
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
