package com.baymin._26_;
/**
 * 复杂链表的实现示例
 * @author Baymin
 * @date 2016年8月1日
 */
public class CopyComplexedList {
	
	public static void main(String[] args) {
		ComplexedListNode node1 = new ComplexedListNode(1);
		ComplexedListNode node2 = new ComplexedListNode(2);
		ComplexedListNode node3 = new ComplexedListNode(3);
		ComplexedListNode node4 = new ComplexedListNode(4);
		ComplexedListNode node5 = new ComplexedListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node1.sibling = node3;
		node2.sibling = node5;
		node4.sibling = node2;
		ComplexedListNode newRoot = ComplexedListUtils.clone(node1);
		while(node1!=null){
			System.out.println("node--"+node1.hashCode()+":"+node1);
			node1 = node1.next;
		}
		System.out.println("--------------------------------------");
		while(newRoot!=null){
			System.out.println("node--"+newRoot.hashCode()+":"+newRoot);
			newRoot = newRoot.next;
		}
	}

}
