package com.baymin._16_;
/**
 * �б���
 * @author BaiXue
 * @date 2016��7��23��
 */
public class ListNode {
	private int value;
	ListNode nextNode;
	public ListNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListNode(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ListNode [value=" + value + ", nextNode=" + nextNode + "]";
	}
	
}
