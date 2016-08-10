package com.baymin._45_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * ԲȦ�����ʣ�µ�����
 * @author Baymin
 * @date 2016��8��10��
 */
public class ListRemainingSolution {
	/**
	 * ���䷽����ģ�⻷������
	 * @param n	���ɴ�0��ʼ��n����
	 * @param m	ɾ����m������
	 * @return	ʣ�������
	 */
	public static int lastRemaining(int n,int m){
		if(n<1 || m<1)
			return -1;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			list.addLast(i);
		}
		int removeIndex = 0;
		while(list.size()>1){
			for (int i = 1; i < m; i++) {
				// ��֤ÿ�ε�removeIndexѭ������list
				removeIndex = (removeIndex+1)%list.size();
			}
			list.remove(removeIndex);
		}
		return list.get(0);
	}
	/**
	 * ����2:ѭ��
	 * @param n	���ɴ�0��ʼ��n����
	 * @param m	ɾ����m������
	 * @return	ʣ�������
	 */
	public static int lastRemaining2(int n, int m){
		if(n<1||m<1)
			return -1;
		int last = 0;
		for (int i = 2; i <= n; i++) {
			last = (last+m)%i;
		}
		return last;
	}
	/**
	 * ����3���ݹ�
	 * @param n	���ɴ�0��ʼ��n����
	 * @param m	ɾ����m������
	 * @return	ʣ�������
	 */
	public static int lastRemainRecurr(int n,int m){
		if(n<1||m<1)
			return -1;
		if(n==1)
			return 0;
		return (lastRemainRecurr(n-1, m)+m)%n;
	}
}
