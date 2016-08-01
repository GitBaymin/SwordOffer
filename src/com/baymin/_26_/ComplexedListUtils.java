package com.baymin._26_;
/**
 * 复杂链表工具类
 * @author Baymin
 * @date 2016年8月1日
 */
public class ComplexedListUtils {
	/**
	 * 复制链表中的节点
	 * @param root
	 */
	public static void cloneNodes(ComplexedListNode root){
		ComplexedListNode node = root;
		while(node!=null){
			ComplexedListNode cloned = new ComplexedListNode();
			cloned.value = node.value;
			cloned.next = node.next;
			cloned.sibling = null;
			node.next = cloned;
			//下一个原节点
			node = cloned.next;
		}
	}
	/**
	 * 复制原链表中的sibling到新的链表中
	 * @param root
	 */
	public static void connectSiblingNodes(ComplexedListNode root){
		ComplexedListNode node = root;
		while(node!=null){
			ComplexedListNode cloned = node.next;
			if(node.sibling!=null)
				cloned.sibling = node.sibling.next;
			//下一个原节点
			node = cloned.next;
		}
	}
	/**
	 * 把链表拆分为两个链表
	 * @param root
	 * @return
	 */
	public static ComplexedListNode reconnectionNodes(ComplexedListNode root){
		ComplexedListNode node = root;
		ComplexedListNode clonedHead = null;
		ComplexedListNode clonedNode = null;
		if(node!=null){
			clonedHead = clonedNode = node.next;
			node.next = clonedNode.next;
			//链表中的下一个节点
			node = node.next;
		}
		while(node!=null){
			clonedNode.next = node.next;
			clonedNode = clonedNode.next;
			node.next = clonedNode.next;
			node = node.next;
		}
		return clonedHead;
	}
	/**
	 * 复杂链表的复制
	 * @param root
	 * @return	复制后的复杂链表
	 */
	public static ComplexedListNode clone(ComplexedListNode root){
		cloneNodes(root);
		connectSiblingNodes(root);
		return reconnectionNodes(root);
	}
}
