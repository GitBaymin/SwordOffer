package com.baymin._18_;
/**
 * ������������
 * @author Baymin
 * @date 2016��7��28��
 */
public class BinaryTreeNodes {
	/**
	 * 
	 * @param t1
	 * @param t2
	 * @return ������1���Ƿ��ж�����2
	 */
	public static boolean hasSubtreeMethod(BinaryTreeNode t1,BinaryTreeNode t2){
		boolean result=false;
		if(t1!=null&&t2!=null){
			if(t1.value==t2.value){
				result=BinaryTreeNodes.doesT1HasT2(t1, t2);
			}
			if(!result){
				result=BinaryTreeNodes.doesT1HasT2(t1.left, t2);
			}
			if(!result){
				result=BinaryTreeNodes.doesT1HasT2(t1.right, t2);
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param t1
	 * @param t2
	 * @returnt1��ĳһ���������ǲ��Ǻ�t2����ͬ�Ľṹ
	 */
	public static boolean doesT1HasT2(BinaryTreeNode t1,BinaryTreeNode t2){
		if(t2==null){
			return true;
		}
		if(t1==null){
			return false;
		}
		if(t1.value!=t2.value){
			return false;
		}
		return doesT1HasT2(t1.left, t2.left) && doesT1HasT2(t1.right, t2.right);
	}
//	public static void insert(int value){
//		
//	}
	public static BinaryTreeNode insert(BinaryTreeNode node,int value){
		if(node==null){
			node = new BinaryTreeNode(value);
		}else{
			if(node.left==null)
				node.left = insert(node.left,value);
			else
				node.right = insert(node.right,value);
		}
		return node;
	}
}
