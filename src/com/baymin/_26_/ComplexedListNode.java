package com.baymin._26_;
/**
 * �б��еĽڵ�
 * @author Baymin
 * @date 2016��8��1��
 */
public class ComplexedListNode {
	int value;
	ComplexedListNode next;
	ComplexedListNode sibling;
	public ComplexedListNode() {
		super();
		value = 0;
		next = null;
		sibling = null;
	}
	public ComplexedListNode(int value) {
		super();
		this.value = value;
		next = null;
		sibling = null;
	}
	
	public ComplexedListNode(int value, ComplexedListNode next,
			ComplexedListNode sibling) {
		super();
		this.value = value;
		this.next = next;
		this.sibling = sibling;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("value="+value);
		sb.append(",next="+(next==null ? "null":next.value));
		sb.append(",sibling="+(sibling==null ? "null":sibling.value));
		return sb.toString();
	}
	
}
