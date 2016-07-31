package com.baymin._24_;

import java.util.Arrays;

/**
 * �����������ĺ����������
 * @author Baymin
 * @date 2016��7��31��
 */
public class IsQueueOfBSTInPostTreeTraversal{
	public static boolean isPostTreeTraversal(int[] num) throws Exception{
		if(num==null)
			throw new Exception("the num is empty.");
		int root = num[num.length-1];
		//�������������������Ľڵ�С�ڸ����
		int i = 0;
		for (; i < num.length; i++) {
			if(num[i]>root)
				break;
		}
		
		//�������������������Ľڵ���ڸ��ڵ�
		for (int j = i; j < num.length-2; j++) {
			if(num[j]<root)
				return false;
		}
		
		//�ж��������ǲ��Ƕ���������
		boolean left = true;
		/*
		 * copyOfRange(int[] original,int from,int to)
		 * original - ��Ҫ���临��һ����Χ������
		 * from - Ҫ���Ƶķ�Χ�ĳ�ʼ������������
		 * to - Ҫ���Ƶķ�Χ���������������������������������λ�����鷶Χ֮�⣩�� 
		 */
		if(i>0)
			left = isPostTreeTraversal(Arrays.copyOfRange(num, 0, i+1));
		
		//�ж��������ǲ��Ƕ���������
		boolean right = true;
		/*
		 * copyOfRange(int[] original,int from,int to)
		 * original - ��Ҫ���临��һ����Χ������
		 * from - Ҫ���Ƶķ�Χ�ĳ�ʼ������������
		 * to - Ҫ���Ƶķ�Χ���������������������������������λ�����鷶Χ֮�⣩�� 
		 * ���i = num.length-2˵��������ȡ���˵����ڶ���������ʱû��������
		 * num.length-1��������������
		 */
		if(i<num.length-2)
			right = isPostTreeTraversal(Arrays.copyOfRange(num, i+1, num.length-1));
		return (left && right);
	}
	public static void main(String[] args) throws Exception {
		int[] num1 = {5,7,6,9,11,10,8};
		int[] num2 = {7,4,6,5};
		System.out.println(isPostTreeTraversal(num1));
		System.out.println(isPostTreeTraversal(num2));
	}

}
