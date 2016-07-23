package com.baymin._16_;
/**
 * 列表结点
 * @author BaiXue
 * @date 2016年7月23日
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
