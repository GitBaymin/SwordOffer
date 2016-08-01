package com.baymin._26_;
/**
 * ������������
 * @author Baymin
 * @date 2016��8��1��
 */
public class ComplexedListUtils {
	/**
	 * ���������еĽڵ�
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
			//��һ��ԭ�ڵ�
			node = cloned.next;
		}
	}
	/**
	 * ����ԭ�����е�sibling���µ�������
	 * @param root
	 */
	public static void connectSiblingNodes(ComplexedListNode root){
		ComplexedListNode node = root;
		while(node!=null){
			ComplexedListNode cloned = node.next;
			if(node.sibling!=null)
				cloned.sibling = node.sibling.next;
			//��һ��ԭ�ڵ�
			node = cloned.next;
		}
	}
	/**
	 * ��������Ϊ��������
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
			//�����е���һ���ڵ�
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
	 * ��������ĸ���
	 * @param root
	 * @return	���ƺ�ĸ�������
	 */
	public static ComplexedListNode clone(ComplexedListNode root){
		cloneNodes(root);
		connectSiblingNodes(root);
		return reconnectionNodes(root);
	}
}
